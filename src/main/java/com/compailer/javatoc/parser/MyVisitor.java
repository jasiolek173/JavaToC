package com.compailer.javatoc.parser;

import com.compailer.javatoc.entitiy.Method;
import com.compailer.javatoc.entitiy.Variable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class MyVisitor extends JavaToCParserBaseVisitor<String> {

    private List<Method> methodList = new ArrayList<>();
    private List<List<Variable>> blocksWithVariables = new ArrayList<>();
    private Map<String, String> enhancedMapVariable = new HashMap<>();

    @Override
    public String visitBlock(JavaToCParser.BlockContext ctx) {
        blocksWithVariables.add(new ArrayList<>());
        String result = visitChildren(ctx);
        blocksWithVariables.remove(blocksWithVariables.size() - 1);
        return result;
    }

    @Override
    public String visitVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx) {
        List<Variable> variablesLast = blocksWithVariables.get(blocksWithVariables.size() - 1);
        if (variablesLast != null) {
            String name = ctx.getChild(1).toString();
            if (!checkIfVariableIsAvailableInLocalScope(name)) {
                return "\nERROR- there is in local scope variable with same name : " + name + "\n" + visitChildren(ctx);
            }
            Variable variable = new Variable();
            variable.setType(ctx.getChild(0).getChild(0).toString());
            variable.setName(ctx.getChild(1).toString());
            variablesLast.add(variable);
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx) {
        List<Variable> variablesLast = blocksWithVariables.get(blocksWithVariables.size() - 1);
        if (variablesLast != null) {
            String name = ctx.getChild(1).toString();
            if (!checkIfVariableIsAvailable(name)) {
                return "\nERROR- there is in local scope variable with same name : " + name + "\n" + visitChildren(ctx);
            }
            Variable variable = new Variable();
            variable.setType(ctx.getChild(0).getChild(0).toString());
            variable.setName(ctx.getChild(1).toString());
            variablesLast.add(variable);
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitParameterList(JavaToCParser.ParameterListContext ctx) {
        int i = 0;
        String errors = "";
        Method method = getLocalMethod();
        if (ctx.children != null)
            while (i < ctx.children.size()) {
                Variable variable = new Variable();
                variable.setType(getReturnTypeName(ctx.getChild(i)));
                variable.setName(ctx.getChild(i + 1).toString());
                if (getMethodWithName(variable.getName()) != null) {
                    errors += "\nERROR- there is function with same name : " + variable.getName() + "\n";
                } else if (!checkIfVariableIsAvailable(variable.getName()))
                    errors += "\nERROR- there is in local scope variable with same name : " + variable.getName() + "\n";
                if (ctx.children.size() > i + 2 && ctx.children.get(i + 2).toString().equals("[")) {
                    variable.setTypeFactor(Variable.Type.ARRAY);
                    i += 5;
                } else
                    i += 3;
                method.addParameter(variable);
            }
        return errors + visitChildren(ctx);
    }

    @Override
    public String visitFunction(JavaToCParser.FunctionContext ctx) {
        String errors = "";
        Method method = new Method();
        Variable returnType = new Variable();
        returnType.setType(getReturnTypeName(ctx.getChild(0)));
        if (ctx.getChild(1).toString().equals("[")) {
            returnType.setTypeFactor(Variable.Type.ARRAY);
            method.setName(ctx.getChild(3).toString());
        } else
            method.setName(ctx.getChild(1).toString());
        method.setReturnType(returnType);
        methodList.add(method);
        String result = visitChildren(ctx);
        if (!isMethodUnique(method))
            errors += "\nERROR there is function with same parameter type and same name: " + method.getName() + "\n";
        return errors + result;
    }

    @Override
    public String visitArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx) {
        List<Variable> variables = getLocalVariableScope();
        Variable variable = new Variable();
        variable.setTypeFactor(Variable.Type.ARRAY);
        variable.setType(getReturnTypeName(ctx.getChild(0)));
        variable.setName(ctx.getChild(1).toString());
        String error = "";
        if (!checkIfVariableIsAvailableInLocalScope(variable.getName()))
            error += "\nERROR- there is in local scope variable with same name : " + variable.getName() + "\n";
        variables.add(variable);
        return error + visitChildren(ctx);
    }

    @Override
    public String visitArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx) {
        List<Variable> variables = getLocalVariableScope();
        Variable variable = new Variable();
        variable.setTypeFactor(Variable.Type.ARRAY);
        variable.setType(getReturnTypeName(ctx.getChild(0)));
        variable.setName(ctx.getChild(1).toString());
        String error = "";
        if (!checkIfVariableIsAvailableInLocalScope(variable.getName()))
            error += "\nERROR- there is in local scope variable with same name : " + variable.getName() + "\n";
        variables.add(variable);
        return error + visitChildren(ctx);
    }

    @Override
    public String visitWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx) {
        blocksWithVariables.add(new ArrayList<>());
        String result = visitChildren(ctx);
        blocksWithVariables.remove(blocksWithVariables.size() - 1);
        return result;
    }

    @Override
    public String visitDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx) {
        blocksWithVariables.add(new ArrayList<>());
        String result = visitChildren(ctx);
        blocksWithVariables.remove(blocksWithVariables.size() - 1);
        return result;
    }

    @Override
    public String visitForStatement(JavaToCParser.ForStatementContext ctx) {
        blocksWithVariables.add(new ArrayList<>());
        String result = "";
        if (ctx.getChild(0) instanceof JavaToCParser.EnhancedForStatementContext)
            result = visitChildren(ctx);
        else {
            if (ctx.getChild(2) instanceof JavaToCParser.ForInitContext) {
                result += visitChildren((RuleNode) ctx.getChild(2)) + ";\n";
                result += "for(";
                for (int i = 3; i < ctx.getChildCount(); i++)
                    result += (ctx.getChild(i) instanceof TerminalNode) ? getReturnTypeName(ctx.getChild(i)) : visitChildren((RuleNode) ctx.getChild(i));
            } else
                result += visitChildren(ctx);
        }
        blocksWithVariables.remove(blocksWithVariables.size() - 1);
        return result;
    }

    @Override
    public String visitEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx) {
        String normalForString = "int ";
        String newVariableString = getReturnTypeName(ctx.getChild(3));
        normalForString += newVariableString + ";\n";
        if (!checkIfVariableIsAvailable(newVariableString)) {
            normalForString += "ERROR- there is in local scope variable with same name : " + newVariableString + "\n";
        }
        Variable tab = getVariableWithNameInAllBlockScope(ctx.getChild(5).toString());
        if (tab == null) {
            normalForString += "ERROR- there is not in local scope variable with name : " + ctx.getChild(5).toString() + "\n";
        }
        Variable variable = new Variable();
        variable.setName(newVariableString);
        variable.setType("int");
        getLocalVariableScope().add(variable);
        normalForString += "for ( " + newVariableString + " =  0; " + newVariableString + "< sizeof(" + ctx.getChild(5).toString() + ")/sizeof(" + ctx.getChild(5).toString() + "[0]);" +
                newVariableString + "++)";
        enhancedMapVariable.put(newVariableString, ctx.getChild(5).toString() + "[" + newVariableString + "]");
        normalForString += visitChildren((RuleNode) ctx.getChild(7));
        enhancedMapVariable.remove(newVariableString);
        return normalForString;
    }

    @Override
    public String visitNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx) {
        String error = "";
        if (!(ctx.getChild(0) instanceof JavaToCParser.FunctionExecutionContext) &&
                !(ctx.getChild(0) instanceof JavaToCParser.ArrayElementContext) &&
                Character.isLetter(ctx.getChild(0).toString().toCharArray()[0]) &&
                checkIfVariableIsAvailable(ctx.getChild(0).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitArrayElement(JavaToCParser.ArrayElementContext ctx) {
        String error = "";
        if (checkIfVariableIsAvailable(ctx.getChild(0).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx) {
        String error = "";
        if (checkIfVariableIsAvailable(ctx.getChild(1).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(1).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx) {
        String error = "";
        if (checkIfVariableIsAvailable(ctx.getChild(1).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(1).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx) {
        String error = "";
        if (checkIfVariableIsAvailable(ctx.getChild(0).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx) {
        String error = "";
        if (checkIfVariableIsAvailable(ctx.getChild(0).toString())) {
            error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx) {
        String error = "";
        String child = ctx.getChild(0).getChild(0).toString();
        if((ctx.getChild(0) instanceof JavaToCParser.LogicalConstContext))
            return visitChildren(ctx);
        if (checkIfVariableIsAvailable(child)) {
            error += "\nERROR- there is no defined variable with name " + child + "\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx) {
        String error = "";
        for(int i = 0; i < ctx.getChildCount(); ++i) {
            if(ctx.getChild(i) instanceof JavaToCParser.ExpressionContext ||
                    ctx.getChild(i) instanceof JavaToCParser.ArrayElementContext ||
                    ctx.getChild(i) instanceof JavaToCParser.AssignmentOperatorContext ||
                    ctx.getChild(i) instanceof  JavaToCParser.FunctionExecutionContext ||
                    ctx.getChild(i).toString().equals("=")) {
                continue;
            }
            if(checkIfVariableIsAvailable(ctx.getChild(i).toString())) {
                error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
            }
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitBitExpression(JavaToCParser.BitExpressionContext ctx) {
        String error = "";
        for(int i = 0; i < ctx.getChildCount(); ++i) {
            if(ctx.getChild(i) instanceof JavaToCParser.ArrayElementContext ||
                    ctx.getChild(i) instanceof JavaToCParser.BitOperatorContext ||
                    ctx.getChild(i) instanceof JavaToCParser.FunctionExecutionContext) {
                continue;
            }
            if(!Character.isDigit(ctx.getChild(i).toString().toCharArray()[0]) &&
                    checkIfVariableIsAvailable(ctx.getChild(i).toString())) {
                error += "\nERROR- there is no defined variable with name " + ctx.getChild(0).toString() + "\n";
            }
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitFunctionExecution(JavaToCParser.FunctionExecutionContext ctx) {
        String error = "";
        Method method = new Method();
        method.setName(ctx.getChild(0).toString());
        for(int i = 1; i < ctx.getChildCount(); ++i) {
            if(ctx.getChild(i) instanceof JavaToCParser.FunctionExecutionContext) {
                Method method1 = getMethodWithName(ctx.getChild(i).getChild(0).toString());
                if(method1 != null)
                    method.addParameter(method1.getReturnType());
                continue;
            }

            if(ctx.getChild(i) instanceof JavaToCParser.ArrayElementContext) {
                Variable variable = getVariableWithNameInAllBlockScope(ctx.getChild(i).getChild(0).toString());
                if(variable != null) {
                    method.addParameter(variable);
                }
                continue;
            }

            if(ctx.getChild(i).toString().equals("(") ||
                    ctx.getChild(i).toString().equals(")") ||
                    ctx.getChild(i).toString().equals(",")) {
                continue;
            }

            if(ctx.getChild(i) instanceof JavaToCParser.NumberContext) {
                if(getMethodWithName(method.getName()).getVariables().size() > method.getVariables().size())
                    method.addParameter(getMethodWithName(method.getName()).getVariables().get(method.getVariables().size()));
                else
                    error += "ERROR- too many parameters in function: " + method.getName() + "\n";
                continue;
            }

            if(checkIfVariableIsAvailable(ctx.getChild(i).toString())) {
                error += "\nERROR- there is no defined variable with name " + ctx.getChild(i).toString() + "\n";
            } else {
                method.addParameter(getVariableWithNameInAllBlockScope(ctx.getChild(i).toString()));
            }
        }
        if(getMethodWithNameAndParameters(method.getName(), method.getVariables()) == null) {
            error += "\nERROR- there is no defined function with name " + method.getName() + " or you type wrong parameters.\n";
        }
        return error + visitChildren(ctx);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        if (enhancedMapVariable.containsKey(node.toString())) {
            return enhancedMapVariable.get(node.toString());
        }
        switch (node.toString()) {
            case "boolean":
                return "int";
            case "true":
                return "1";
            case "false":
                return "0";
            case ";":
                return ";\n";
            case "}":
                return "}\n";
            case "{":
                return "{\n";
        }
        return node.toString() + " ";
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (nextResult != null && aggregate != null && !nextResult.equals("null") && !aggregate.equals("null"))
            return aggregate + nextResult;
        if (nextResult != null && !nextResult.equals("null"))
            return nextResult;
        if (aggregate != null && !aggregate.equals("null"))
            return aggregate;
        return "";
    }


    private String getReturnTypeName(ParseTree typeContext) {
        if (typeContext instanceof JavaToCParser.TypeContext) {
            return typeContext.getChild(0).toString();
        }
        return typeContext.toString();
    }

    private Method getMethodWithName(String name) {
        for (Method method : methodList)
            if (method.getName().equals(name))
                return method;
        return null;
    }

    private Method getMethodWithNameAndParameters(String name, List<Variable> parameters) {
        for (Method method : methodList) {
            if(method.getName().equals(name)) {
                if(method.getVariables().equals(parameters)) {
                    return method;
                }
            }
        }
        return null;
    }

    private Variable getVariableWithNameFromMethod(Method method, String name) {
        if (method == null)
            return null;
        for (Variable v : method.getVariables())
            if (v.getName().equals(name))
                return v;
        return null;
    }

    private Variable getVariableWithNameFromMethodsParameters(String name) {
        for (Method method : methodList) {
            Variable variable = getVariableWithNameFromMethod(method, name);
            if (variable != null)
                return variable;
        }
        return null;
    }

    private Variable getVariableWithNameInScope(String name, List<Variable> list) {
        if (list != null) {
            Optional<Variable> variable = list.stream().filter(p -> p.getName().equals(name)).findFirst();
            return variable.orElse(null);
        } else {
            return null;
        }
    }

    private Variable getVariableWithNameInAllBlockScope(String name) {
        for (List<Variable> variables : blocksWithVariables) {
            Variable variable = getVariableWithNameInScope(name, variables);
            if (variable != null)
                return variable;
        }
        return null;
    }

    private Variable getVariableWithNameInAllScopesAndMethodsParameters(String name) {
        Variable variable = getVariableWithNameInAllBlockScope(name);
        return (variable != null) ? variable : getVariableWithNameFromMethodsParameters(name);
    }

    private boolean checkIfVariableIsAvailableInLocalScope(String name) {
        return getVariableWithNameInScope(name, getLocalVariableScope()) == null && getMethodWithName(name) == null
                && getVariableWithNameFromMethod(getLocalMethod(), name) == null;
    }

    private boolean checkIfVariableIsAvailable(String name) {
        return getVariableWithNameInAllBlockScope(name) == null && getMethodWithName(name) == null
                && getVariableWithNameFromMethod(getLocalMethod(), name) == null;
    }

    private List<Variable> getLocalVariableScope() {
        if (blocksWithVariables.size() == 0) return null;
        return blocksWithVariables.get(blocksWithVariables.size() - 1);
    }

    private Method getLocalMethod() {
        if (methodList.size() == 0) return null;
        return methodList.get(methodList.size() - 1);
    }

    private static String repeatChar(char c, int length) {
        char[] data = new char[length];
        Arrays.fill(data, c);
        return new String(data);
    }

    private boolean isMethodUnique(Method method) {
        for (Method method1 : methodList) {
            if (method1 == method || !method.getName().equals(method.getName()) || method.getVariables().size() != method1.getVariables().size())
                continue;
            if (method.getVariables().size() == 0)
                return false;
            for (int i = 0; i < method.getVariables().size(); i++) {
                Variable a = method.getVariables().get(i);
                Variable b = method1.getVariables().get(i);
                if (!a.getType().equals(b.getType()) || !a.getTypeFactor().equals(b.getTypeFactor()))
                    continue;
                return false;
            }
        }
        return true;
    }
}
