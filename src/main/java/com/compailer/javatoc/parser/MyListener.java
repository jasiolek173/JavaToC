package com.compailer.javatoc.parser;

import com.compailer.javatoc.entitiy.Method;
import com.compailer.javatoc.entitiy.Variable;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class MyListener extends BaseErrorListener implements JavaToCParserListener {

    private String text="";

    public String getText() {
        return text;
    }

    private List<Method> methodList=new ArrayList<>();
    private List<List<Variable>>    blocksWithVariables= new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {

       text+=msg;
    }

    @Override
    public void enterCompilationUnit(JavaToCParser.CompilationUnitContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitCompilationUnit(JavaToCParser.CompilationUnitContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterStatement(JavaToCParser.StatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitStatement(JavaToCParser.StatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterLoopStatement(JavaToCParser.LoopStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitLoopStatement(JavaToCParser.LoopStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterComparisonOperator(JavaToCParser.ComparisonOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitComparisonOperator(JavaToCParser.ComparisonOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterNumber(JavaToCParser.NumberContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitNumber(JavaToCParser.NumberContext ctx) {

    }

    @Override
    public void enterNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterLogicalConst(JavaToCParser.LogicalConstContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitLogicalConst(JavaToCParser.LogicalConstContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterArithmeticExpression(JavaToCParser.ArithmeticExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitArithmeticExpression(JavaToCParser.ArithmeticExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterComparisonExpression(JavaToCParser.ComparisonExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitComparisonExpression(JavaToCParser.ComparisonExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterLogicalExpression(JavaToCParser.LogicalExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitLogicalExpression(JavaToCParser.LogicalExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterType(JavaToCParser.TypeContext ctx) {
        if(ctx.getChildCount()==1 && ctx.getChild(0)==ctx.BOOLEAN_SYM()){
            ctx.removeLastChild();
            ctx.addChild(ctx.INTEGER_SYM());
        }
    }

    @Override
    public void exitType(JavaToCParser.TypeContext ctx) {
        String txt = ctx.getText();
    }

    @Override
    public void enterBlock(JavaToCParser.BlockContext ctx) {
       blocksWithVariables.add(new ArrayList<>());
    }

    @Override
    public void exitBlock(JavaToCParser.BlockContext ctx) {
        blocksWithVariables.remove(blocksWithVariables.size()-1);
    }

    @Override
    public void enterLoopBlock(JavaToCParser.LoopBlockContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitLoopBlock(JavaToCParser.LoopBlockContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterIfStatement(JavaToCParser.IfStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitIfStatement(JavaToCParser.IfStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterAssignmentOperator(JavaToCParser.AssignmentOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitAssignmentOperator(JavaToCParser.AssignmentOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterExpression(JavaToCParser.ExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitExpression(JavaToCParser.ExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterAssignment(JavaToCParser.AssignmentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitAssignment(JavaToCParser.AssignmentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterForStatement(JavaToCParser.ForStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitForStatement(JavaToCParser.ForStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterForInit(JavaToCParser.ForInitContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitForInit(JavaToCParser.ForInitContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterForUpdate(JavaToCParser.ForUpdateContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitForUpdate(JavaToCParser.ForUpdateContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterReturnStatement(JavaToCParser.ReturnStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitReturnStatement(JavaToCParser.ReturnStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterBreakStatement(JavaToCParser.BreakStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitBreakStatement(JavaToCParser.BreakStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterContinueStatement(JavaToCParser.ContinueStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitContinueStatement(JavaToCParser.ContinueStatementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterFunction(JavaToCParser.FunctionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitFunction(JavaToCParser.FunctionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterFunctionExecution(JavaToCParser.FunctionExecutionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitFunctionExecution(JavaToCParser.FunctionExecutionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterFunctionExecutionWithSemicolon(JavaToCParser.FunctionExecutionWithSemicolonContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitFunctionExecutionWithSemicolon(JavaToCParser.FunctionExecutionWithSemicolonContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterParameterList(JavaToCParser.ParameterListContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitParameterList(JavaToCParser.ParameterListContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterBitOperator(JavaToCParser.BitOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitBitOperator(JavaToCParser.BitOperatorContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterBitExpression(JavaToCParser.BitExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitBitExpression(JavaToCParser.BitExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterStringNullAssignment(JavaToCParser.StringNullAssignmentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitStringNullAssignment(JavaToCParser.StringNullAssignmentContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterArrayElement(JavaToCParser.ArrayElementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitArrayElement(JavaToCParser.ArrayElementContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void enterVariableDeclarationWithInitialization(JavaToCParser.VariableDeclarationWithInitializationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void exitVariableDeclarationWithInitialization(JavaToCParser.VariableDeclarationWithInitializationContext ctx) {
        System.out.println("ENTER");
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        text+=terminalNode.getText();
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        System.out.println("ENTER");
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        System.out.println("ENTER");
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        System.out.println("ENTER");
    }
}
