// Generated from JavaToCParser.g4 by ANTLR 4.7.1

package com.compailer.javatoc.parser;
    
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaToCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaToCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaToCParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaToCParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#variableDeclarationWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationWithoutSemicolon(JavaToCParser.VariableDeclarationWithoutSemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaToCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(JavaToCParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(JavaToCParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JavaToCParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#numberEquivalent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberEquivalent(JavaToCParser.NumberEquivalentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#logicalConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalConst(JavaToCParser.LogicalConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#logicalEquivalent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEquivalent(JavaToCParser.LogicalEquivalentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(JavaToCParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(JavaToCParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(JavaToCParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaToCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaToCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(JavaToCParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaToCParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(JavaToCParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#whileDoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDoStatement(JavaToCParser.WhileDoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(JavaToCParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaToCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(JavaToCParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(JavaToCParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(JavaToCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaToCParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(JavaToCParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(JavaToCParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaToCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(JavaToCParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(JavaToCParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaToCParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaToCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(JavaToCParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#bitExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpression(JavaToCParser.BitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#stringNullAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringNullAssignment(JavaToCParser.StringNullAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#preIncrementationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementationExpression(JavaToCParser.PreIncrementationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#postIncrementationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementationExpression(JavaToCParser.PostIncrementationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#preDecrementationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementationExpression(JavaToCParser.PreDecrementationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#postDecrementationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementationExpression(JavaToCParser.PostDecrementationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclaration(JavaToCParser.ArrayVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#arrayVariableDeclarationWithInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclarationWithInitialization(JavaToCParser.ArrayVariableDeclarationWithInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaToCParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(JavaToCParser.ArrayElementContext ctx);
}