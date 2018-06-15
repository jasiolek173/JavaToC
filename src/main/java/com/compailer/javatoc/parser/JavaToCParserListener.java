// Generated from JavaToCParser.g4 by ANTLR 4.7.1

package com.compailer.javatoc.parser;
    
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaToCParser}.
 */
public interface JavaToCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaToCParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaToCParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#variableDeclarationWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#variableDeclarationWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaToCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaToCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(JavaToCParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(JavaToCParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(JavaToCParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(JavaToCParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JavaToCParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JavaToCParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#numberEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void enterLogicalConst(JavaToCParser.LogicalConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#logicalConst}.
	 * @param ctx the parse tree
	 */
	void exitLogicalConst(JavaToCParser.LogicalConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(JavaToCParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(JavaToCParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(JavaToCParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(JavaToCParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(JavaToCParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(JavaToCParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaToCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaToCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaToCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaToCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(JavaToCParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(JavaToCParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaToCParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaToCParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#whileDoStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(JavaToCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(JavaToCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaToCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaToCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavaToCParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavaToCParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(JavaToCParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(JavaToCParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaToCParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaToCParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(JavaToCParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(JavaToCParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaToCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaToCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(JavaToCParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(JavaToCParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(JavaToCParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(JavaToCParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaToCParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaToCParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaToCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaToCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(JavaToCParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(JavaToCParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#bitExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitExpression(JavaToCParser.BitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#bitExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitExpression(JavaToCParser.BitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#stringNullAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStringNullAssignment(JavaToCParser.StringNullAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#stringNullAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStringNullAssignment(JavaToCParser.StringNullAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#arrayVariableDeclarationWithInitialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#arrayVariableDeclarationWithInitialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaToCParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(JavaToCParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaToCParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(JavaToCParser.ArrayElementContext ctx);
}