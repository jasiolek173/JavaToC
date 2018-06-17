// Generated from JavaToCParser.g4 by ANTLR 4.7.1

package com.compailer.javatoc.parser;
    
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaToCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN_SYM=1, BREAK_SYM=2, BYTE_SYM=3, CASE_SYM=4, CHAR_SYM=5, CONST_SYM=6, 
		CONTINUE_SYM=7, DO_SYM=8, DOUBLE_SYM=9, ELSE_SYM=10, FLOAT_SYM=11, FOR_SYM=12, 
		IF_SYM=13, LONG_SYM=14, RETURN_SYM=15, SHORT_SYM=16, SWITCH_SYM=17, VOID_SYM=18, 
		WHILE_SYM=19, TRUE_SYM=20, FALSE_SYM=21, NULL_SYM=22, STRING_SYM=23, INTEGER_SYM=24, 
		COMM_SYM=25, UN_RIGHT_BIT_SHIFT_SYM=26, ASSIGN_LEFT_BIT_SHIFT_SYM=27, 
		ASSIGN_RIGHT_BIT_SHIFT_SYM=28, ASSIGN_UN_RIGHT_BIT_SHIFT_SYM=29, ASSIGN_BITWISE_AND_SYM=30, 
		ASSIGN_BITWISE_EX_OR_SYM=31, ASSIGN_BITWISE_IN_OR_SYM=32, ASSIGN_LOGICAL_AND_SYM=33, 
		LOGICAL_AND_SYM=34, LOGICAL_OR_SYM=35, INCREMENT_SYM=36, DECREMENT_SYM=37, 
		ASSIGN_PLUS_SYM=38, ASSIGN_MINUS_SYM=39, EQUALS_SYM=40, NOT_EQUALS_SYM=41, 
		LEFT_BIT_SHIFT_SYM=42, RIGHT_BIT_SHIFT_SYM=43, ASSIGN_MULTIPLICATION_SYM=44, 
		ASSIGN_DIVISION_SYM=45, ASSIGN_MODULO_SYM=46, LEFT_PARENTHESE_SYM=47, 
		RIGHT_PARENTHESE_SYM=48, LEFT_BRACE_SYM=49, RIGHT_BRACE_SYM=50, SEMICOLON_SYM=51, 
		COLON_SYM=52, COMMA_SYM=53, DOT_SYM=54, QUESTION_MARK_SYM=55, PLUS_SYM=56, 
		MINUS_SYM=57, MULTIPLICATION_SYM=58, DIVISION_SYM=59, BITWISE_AND_SYM=60, 
		BITWISE_IN_OR_SYM=61, MODULO_SYM=62, NEGATIVE_SYM=63, TWO_BACKSLASHES_SYM=64, 
		ASSIGNMENT_SYM=65, GREATER_SYM=66, GREATER_OR_EQUAL_SYM=67, LESS_SYM=68, 
		LESS_OR_EQUAL_SYM=69, LEFT_BRACKET_SYM=70, RIGHT_BRACKET_SYM=71, TILDE_SYM=72, 
		BITWISE_EX_OR_SYM=73, ID=74, INTEGER_NUMBER=75, FLOAT_NUMBER=76, STRING=77, 
		CHAR=78, WHITE_SPACES=79, NEW_LINE=80, LINE_COMMENT=81, COMMENT=82;
	public static final int
		RULE_compilationUnit = 0, RULE_variableDeclaration = 1, RULE_variableDeclarationWithoutSemicolon = 2, 
		RULE_statement = 3, RULE_loopStatement = 4, RULE_comparisonOperator = 5, 
		RULE_number = 6, RULE_numberEquivalent = 7, RULE_logicalConst = 8, RULE_logicalEquivalent = 9, 
		RULE_arithmeticExpression = 10, RULE_comparisonExpression = 11, RULE_logicalExpression = 12, 
		RULE_type = 13, RULE_block = 14, RULE_loopBlock = 15, RULE_ifStatement = 16, 
		RULE_doWhileStatement = 17, RULE_whileDoStatement = 18, RULE_assignmentOperator = 19, 
		RULE_expression = 20, RULE_assignment = 21, RULE_assignmentExpression = 22, 
		RULE_forStatement = 23, RULE_forInit = 24, RULE_forUpdate = 25, RULE_enhancedForStatement = 26, 
		RULE_returnStatement = 27, RULE_breakStatement = 28, RULE_continueStatement = 29, 
		RULE_function = 30, RULE_functionExecution = 31, RULE_functionExecutionWithSemicolon = 32, 
		RULE_parameterList = 33, RULE_bitOperator = 34, RULE_bitExpression = 35, 
		RULE_stringNullAssignment = 36, RULE_preIncrementationExpression = 37, 
		RULE_postIncrementationExpression = 38, RULE_preDecrementationExpression = 39, 
		RULE_postDecrementationExpression = 40, RULE_arrayVariableDeclaration = 41, 
		RULE_arrayVariableDeclarationWithInitialization = 42, RULE_arrayElement = 43;
	public static final String[] ruleNames = {
		"compilationUnit", "variableDeclaration", "variableDeclarationWithoutSemicolon", 
		"statement", "loopStatement", "comparisonOperator", "number", "numberEquivalent", 
		"logicalConst", "logicalEquivalent", "arithmeticExpression", "comparisonExpression", 
		"logicalExpression", "type", "block", "loopBlock", "ifStatement", "doWhileStatement", 
		"whileDoStatement", "assignmentOperator", "expression", "assignment", 
		"assignmentExpression", "forStatement", "forInit", "forUpdate", "enhancedForStatement", 
		"returnStatement", "breakStatement", "continueStatement", "function", 
		"functionExecution", "functionExecutionWithSemicolon", "parameterList", 
		"bitOperator", "bitExpression", "stringNullAssignment", "preIncrementationExpression", 
		"postIncrementationExpression", "preDecrementationExpression", "postDecrementationExpression", 
		"arrayVariableDeclaration", "arrayVariableDeclarationWithInitialization", 
		"arrayElement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'break'", "'byte'", "'case'", "'char'", "'const'", 
		"'continue'", "'do'", "'double'", "'else'", "'float'", "'for'", "'if'", 
		"'long'", "'return'", "'short'", "'switch'", "'void'", "'while'", "'true'", 
		"'false'", "'null'", "'String'", "'int'", "'//'", "'>>>'", "'<<='", "'>>='", 
		"'>>>='", "'&='", "'^='", "'|='", "'&&='", "'&&'", "'||'", "'++'", "'--'", 
		"'+='", "'-='", "'=='", "'!='", "'<<'", "'>>'", "'*='", "'/='", "'%='", 
		"'('", "')'", "'{'", "'}'", "';'", "':'", "','", "'.'", "'?'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'%'", "'!'", "'\\'", "'='", "'>'", 
		"'>='", "'<'", "'<='", "'['", "']'", "'~'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN_SYM", "BREAK_SYM", "BYTE_SYM", "CASE_SYM", "CHAR_SYM", 
		"CONST_SYM", "CONTINUE_SYM", "DO_SYM", "DOUBLE_SYM", "ELSE_SYM", "FLOAT_SYM", 
		"FOR_SYM", "IF_SYM", "LONG_SYM", "RETURN_SYM", "SHORT_SYM", "SWITCH_SYM", 
		"VOID_SYM", "WHILE_SYM", "TRUE_SYM", "FALSE_SYM", "NULL_SYM", "STRING_SYM", 
		"INTEGER_SYM", "COMM_SYM", "UN_RIGHT_BIT_SHIFT_SYM", "ASSIGN_LEFT_BIT_SHIFT_SYM", 
		"ASSIGN_RIGHT_BIT_SHIFT_SYM", "ASSIGN_UN_RIGHT_BIT_SHIFT_SYM", "ASSIGN_BITWISE_AND_SYM", 
		"ASSIGN_BITWISE_EX_OR_SYM", "ASSIGN_BITWISE_IN_OR_SYM", "ASSIGN_LOGICAL_AND_SYM", 
		"LOGICAL_AND_SYM", "LOGICAL_OR_SYM", "INCREMENT_SYM", "DECREMENT_SYM", 
		"ASSIGN_PLUS_SYM", "ASSIGN_MINUS_SYM", "EQUALS_SYM", "NOT_EQUALS_SYM", 
		"LEFT_BIT_SHIFT_SYM", "RIGHT_BIT_SHIFT_SYM", "ASSIGN_MULTIPLICATION_SYM", 
		"ASSIGN_DIVISION_SYM", "ASSIGN_MODULO_SYM", "LEFT_PARENTHESE_SYM", "RIGHT_PARENTHESE_SYM", 
		"LEFT_BRACE_SYM", "RIGHT_BRACE_SYM", "SEMICOLON_SYM", "COLON_SYM", "COMMA_SYM", 
		"DOT_SYM", "QUESTION_MARK_SYM", "PLUS_SYM", "MINUS_SYM", "MULTIPLICATION_SYM", 
		"DIVISION_SYM", "BITWISE_AND_SYM", "BITWISE_IN_OR_SYM", "MODULO_SYM", 
		"NEGATIVE_SYM", "TWO_BACKSLASHES_SYM", "ASSIGNMENT_SYM", "GREATER_SYM", 
		"GREATER_OR_EQUAL_SYM", "LESS_SYM", "LESS_OR_EQUAL_SYM", "LEFT_BRACKET_SYM", 
		"RIGHT_BRACKET_SYM", "TILDE_SYM", "BITWISE_EX_OR_SYM", "ID", "INTEGER_NUMBER", 
		"FLOAT_NUMBER", "STRING", "CHAR", "WHITE_SPACES", "NEW_LINE", "LINE_COMMENT", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaToCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaToCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << LONG_SYM) | (1L << SHORT_SYM) | (1L << VOID_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM))) != 0)) {
				{
				{
				setState(88);
				function();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			type();
			setState(95);
			match(ID);
			setState(96);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationWithoutSemicolonContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public VariableDeclarationWithoutSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationWithoutSemicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterVariableDeclarationWithoutSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitVariableDeclarationWithoutSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitVariableDeclarationWithoutSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationWithoutSemicolonContext variableDeclarationWithoutSemicolon() throws RecognitionException {
		VariableDeclarationWithoutSemicolonContext _localctx = new VariableDeclarationWithoutSemicolonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclarationWithoutSemicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(JavaToCParser.LINE_COMMENT, 0); }
		public TerminalNode COMMENT() { return getToken(JavaToCParser.COMMENT, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationContext arrayVariableDeclaration() {
			return getRuleContext(ArrayVariableDeclarationContext.class,0);
		}
		public ArrayVariableDeclarationWithInitializationContext arrayVariableDeclarationWithInitialization() {
			return getRuleContext(ArrayVariableDeclarationWithInitializationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileDoStatementContext whileDoStatement() {
			return getRuleContext(WhileDoStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public FunctionExecutionWithSemicolonContext functionExecutionWithSemicolon() {
			return getRuleContext(FunctionExecutionWithSemicolonContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(LINE_COMMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(COMMENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				arrayVariableDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				arrayVariableDeclarationWithInitialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				ifStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				whileDoStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				doWhileStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				forStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				enhancedForStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				returnStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				assignment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(113);
				expression();
				setState(114);
				match(SEMICOLON_SYM);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(116);
				functionExecutionWithSemicolon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopStatement);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case DO_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case FOR_SYM:
			case IF_SYM:
			case LONG_SYM:
			case RETURN_SYM:
			case SHORT_SYM:
			case WHILE_SYM:
			case TRUE_SYM:
			case FALSE_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
			case INCREMENT_SYM:
			case DECREMENT_SYM:
			case LEFT_PARENTHESE_SYM:
			case MINUS_SYM:
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case LINE_COMMENT:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				statement();
				}
				break;
			case BREAK_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				breakStatement();
				}
				break;
			case CONTINUE_SYM:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				continueStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode GREATER_SYM() { return getToken(JavaToCParser.GREATER_SYM, 0); }
		public TerminalNode LESS_SYM() { return getToken(JavaToCParser.LESS_SYM, 0); }
		public TerminalNode GREATER_OR_EQUAL_SYM() { return getToken(JavaToCParser.GREATER_OR_EQUAL_SYM, 0); }
		public TerminalNode LESS_OR_EQUAL_SYM() { return getToken(JavaToCParser.LESS_OR_EQUAL_SYM, 0); }
		public TerminalNode EQUALS_SYM() { return getToken(JavaToCParser.EQUALS_SYM, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (EQUALS_SYM - 40)) | (1L << (GREATER_SYM - 40)) | (1L << (GREATER_OR_EQUAL_SYM - 40)) | (1L << (LESS_SYM - 40)) | (1L << (LESS_OR_EQUAL_SYM - 40)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(JavaToCParser.INTEGER_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(JavaToCParser.FLOAT_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUMBER || _la==FLOAT_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberEquivalentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public FunctionExecutionContext functionExecution() {
			return getRuleContext(FunctionExecutionContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public NumberEquivalentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberEquivalent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterNumberEquivalent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitNumberEquivalent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitNumberEquivalent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberEquivalentContext numberEquivalent() throws RecognitionException {
		NumberEquivalentContext _localctx = new NumberEquivalentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numberEquivalent);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				functionExecution();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				arrayElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalConstContext extends ParserRuleContext {
		public TerminalNode TRUE_SYM() { return getToken(JavaToCParser.TRUE_SYM, 0); }
		public TerminalNode FALSE_SYM() { return getToken(JavaToCParser.FALSE_SYM, 0); }
		public LogicalConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterLogicalConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitLogicalConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitLogicalConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalConstContext logicalConst() throws RecognitionException {
		LogicalConstContext _localctx = new LogicalConstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==TRUE_SYM || _la==FALSE_SYM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalEquivalentContext extends ParserRuleContext {
		public LogicalConstContext logicalConst() {
			return getRuleContext(LogicalConstContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public FunctionExecutionContext functionExecution() {
			return getRuleContext(FunctionExecutionContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public LogicalEquivalentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalEquivalent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterLogicalEquivalent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitLogicalEquivalent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitLogicalEquivalent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalEquivalentContext logicalEquivalent() throws RecognitionException {
		LogicalEquivalentContext _localctx = new LogicalEquivalentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalEquivalent);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				logicalConst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				functionExecution();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				arrayElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode MINUS_SYM() { return getToken(JavaToCParser.MINUS_SYM, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public NumberEquivalentContext numberEquivalent() {
			return getRuleContext(NumberEquivalentContext.class,0);
		}
		public TerminalNode MULTIPLICATION_SYM() { return getToken(JavaToCParser.MULTIPLICATION_SYM, 0); }
		public TerminalNode DIVISION_SYM() { return getToken(JavaToCParser.DIVISION_SYM, 0); }
		public TerminalNode PLUS_SYM() { return getToken(JavaToCParser.PLUS_SYM, 0); }
		public TerminalNode MODULO_SYM() { return getToken(JavaToCParser.MODULO_SYM, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS_SYM:
				{
				setState(143);
				match(MINUS_SYM);
				setState(144);
				arithmeticExpression(8);
				}
				break;
			case LEFT_PARENTHESE_SYM:
				{
				setState(145);
				match(LEFT_PARENTHESE_SYM);
				setState(146);
				arithmeticExpression(0);
				setState(147);
				match(RIGHT_PARENTHESE_SYM);
				}
				break;
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(149);
				numberEquivalent();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(152);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(153);
						match(MULTIPLICATION_SYM);
						setState(154);
						arithmeticExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156);
						match(DIVISION_SYM);
						setState(157);
						arithmeticExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(159);
						match(PLUS_SYM);
						setState(160);
						arithmeticExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(161);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(162);
						match(MINUS_SYM);
						setState(163);
						arithmeticExpression(5);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						match(MODULO_SYM);
						setState(166);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparisonExpression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				arithmeticExpression(0);
				setState(173);
				comparisonOperator();
				setState(174);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(LEFT_PARENTHESE_SYM);
				setState(177);
				comparisonExpression();
				setState(178);
				match(RIGHT_PARENTHESE_SYM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public LogicalEquivalentContext logicalEquivalent() {
			return getRuleContext(LogicalEquivalentContext.class,0);
		}
		public TerminalNode LOGICAL_AND_SYM() { return getToken(JavaToCParser.LOGICAL_AND_SYM, 0); }
		public TerminalNode LOGICAL_OR_SYM() { return getToken(JavaToCParser.LOGICAL_OR_SYM, 0); }
		public TerminalNode BITWISE_AND_SYM() { return getToken(JavaToCParser.BITWISE_AND_SYM, 0); }
		public TerminalNode BITWISE_IN_OR_SYM() { return getToken(JavaToCParser.BITWISE_IN_OR_SYM, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_logicalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				comparisonExpression();
				}
				break;
			case 2:
				{
				setState(184);
				match(LEFT_PARENTHESE_SYM);
				setState(185);
				logicalExpression(0);
				setState(186);
				match(RIGHT_PARENTHESE_SYM);
				}
				break;
			case 3:
				{
				setState(188);
				logicalEquivalent();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						match(LOGICAL_AND_SYM);
						setState(193);
						logicalExpression(8);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						match(LOGICAL_OR_SYM);
						setState(196);
						logicalExpression(7);
						}
						break;
					case 3:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						match(BITWISE_AND_SYM);
						setState(199);
						logicalExpression(6);
						}
						break;
					case 4:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(BITWISE_IN_OR_SYM);
						setState(202);
						logicalExpression(5);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN_SYM() { return getToken(JavaToCParser.BOOLEAN_SYM, 0); }
		public TerminalNode BYTE_SYM() { return getToken(JavaToCParser.BYTE_SYM, 0); }
		public TerminalNode CHAR_SYM() { return getToken(JavaToCParser.CHAR_SYM, 0); }
		public TerminalNode INTEGER_SYM() { return getToken(JavaToCParser.INTEGER_SYM, 0); }
		public TerminalNode SHORT_SYM() { return getToken(JavaToCParser.SHORT_SYM, 0); }
		public TerminalNode LONG_SYM() { return getToken(JavaToCParser.LONG_SYM, 0); }
		public TerminalNode FLOAT_SYM() { return getToken(JavaToCParser.FLOAT_SYM, 0); }
		public TerminalNode DOUBLE_SYM() { return getToken(JavaToCParser.DOUBLE_SYM, 0); }
		public TerminalNode STRING_SYM() { return getToken(JavaToCParser.STRING_SYM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << LONG_SYM) | (1L << SHORT_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE_SYM() { return getToken(JavaToCParser.LEFT_BRACE_SYM, 0); }
		public TerminalNode RIGHT_BRACE_SYM() { return getToken(JavaToCParser.RIGHT_BRACE_SYM, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LEFT_BRACE_SYM);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << DO_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << FOR_SYM) | (1L << IF_SYM) | (1L << LONG_SYM) | (1L << RETURN_SYM) | (1L << SHORT_SYM) | (1L << WHILE_SYM) | (1L << TRUE_SYM) | (1L << FALSE_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM) | (1L << INCREMENT_SYM) | (1L << DECREMENT_SYM) | (1L << LEFT_PARENTHESE_SYM) | (1L << MINUS_SYM))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ID - 74)) | (1L << (INTEGER_NUMBER - 74)) | (1L << (FLOAT_NUMBER - 74)) | (1L << (LINE_COMMENT - 74)) | (1L << (COMMENT - 74)))) != 0)) {
				{
				{
				setState(211);
				statement();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RIGHT_BRACE_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE_SYM() { return getToken(JavaToCParser.LEFT_BRACE_SYM, 0); }
		public TerminalNode RIGHT_BRACE_SYM() { return getToken(JavaToCParser.RIGHT_BRACE_SYM, 0); }
		public List<LoopStatementContext> loopStatement() {
			return getRuleContexts(LoopStatementContext.class);
		}
		public LoopStatementContext loopStatement(int i) {
			return getRuleContext(LoopStatementContext.class,i);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitLoopBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitLoopBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LEFT_BRACE_SYM);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BREAK_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << CONTINUE_SYM) | (1L << DO_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << FOR_SYM) | (1L << IF_SYM) | (1L << LONG_SYM) | (1L << RETURN_SYM) | (1L << SHORT_SYM) | (1L << WHILE_SYM) | (1L << TRUE_SYM) | (1L << FALSE_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM) | (1L << INCREMENT_SYM) | (1L << DECREMENT_SYM) | (1L << LEFT_PARENTHESE_SYM) | (1L << MINUS_SYM))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (ID - 74)) | (1L << (INTEGER_NUMBER - 74)) | (1L << (FLOAT_NUMBER - 74)) | (1L << (LINE_COMMENT - 74)) | (1L << (COMMENT - 74)))) != 0)) {
				{
				{
				setState(220);
				loopStatement();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(RIGHT_BRACE_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF_SYM() { return getTokens(JavaToCParser.IF_SYM); }
		public TerminalNode IF_SYM(int i) {
			return getToken(JavaToCParser.IF_SYM, i);
		}
		public List<TerminalNode> LEFT_PARENTHESE_SYM() { return getTokens(JavaToCParser.LEFT_PARENTHESE_SYM); }
		public TerminalNode LEFT_PARENTHESE_SYM(int i) {
			return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESE_SYM() { return getTokens(JavaToCParser.RIGHT_PARENTHESE_SYM); }
		public TerminalNode RIGHT_PARENTHESE_SYM(int i) {
			return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSE_SYM() { return getTokens(JavaToCParser.ELSE_SYM); }
		public TerminalNode ELSE_SYM(int i) {
			return getToken(JavaToCParser.ELSE_SYM, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IF_SYM);
			setState(229);
			match(LEFT_PARENTHESE_SYM);
			setState(230);
			logicalExpression(0);
			setState(231);
			match(RIGHT_PARENTHESE_SYM);
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE_SYM:
				{
				setState(232);
				block();
				}
				break;
			case BOOLEAN_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case DO_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case FOR_SYM:
			case IF_SYM:
			case LONG_SYM:
			case RETURN_SYM:
			case SHORT_SYM:
			case WHILE_SYM:
			case TRUE_SYM:
			case FALSE_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
			case INCREMENT_SYM:
			case DECREMENT_SYM:
			case LEFT_PARENTHESE_SYM:
			case MINUS_SYM:
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case LINE_COMMENT:
			case COMMENT:
				{
				setState(233);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(ELSE_SYM);
					setState(237);
					match(IF_SYM);
					setState(238);
					match(LEFT_PARENTHESE_SYM);
					setState(239);
					logicalExpression(0);
					setState(240);
					match(RIGHT_PARENTHESE_SYM);
					setState(243);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LEFT_BRACE_SYM:
						{
						setState(241);
						block();
						}
						break;
					case BOOLEAN_SYM:
					case BYTE_SYM:
					case CHAR_SYM:
					case DO_SYM:
					case DOUBLE_SYM:
					case FLOAT_SYM:
					case FOR_SYM:
					case IF_SYM:
					case LONG_SYM:
					case RETURN_SYM:
					case SHORT_SYM:
					case WHILE_SYM:
					case TRUE_SYM:
					case FALSE_SYM:
					case STRING_SYM:
					case INTEGER_SYM:
					case INCREMENT_SYM:
					case DECREMENT_SYM:
					case LEFT_PARENTHESE_SYM:
					case MINUS_SYM:
					case ID:
					case INTEGER_NUMBER:
					case FLOAT_NUMBER:
					case LINE_COMMENT:
					case COMMENT:
						{
						setState(242);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(250);
				match(ELSE_SYM);
				setState(253);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE_SYM:
					{
					setState(251);
					block();
					}
					break;
				case BOOLEAN_SYM:
				case BYTE_SYM:
				case CHAR_SYM:
				case DO_SYM:
				case DOUBLE_SYM:
				case FLOAT_SYM:
				case FOR_SYM:
				case IF_SYM:
				case LONG_SYM:
				case RETURN_SYM:
				case SHORT_SYM:
				case WHILE_SYM:
				case TRUE_SYM:
				case FALSE_SYM:
				case STRING_SYM:
				case INTEGER_SYM:
				case INCREMENT_SYM:
				case DECREMENT_SYM:
				case LEFT_PARENTHESE_SYM:
				case MINUS_SYM:
				case ID:
				case INTEGER_NUMBER:
				case FLOAT_NUMBER:
				case LINE_COMMENT:
				case COMMENT:
					{
					setState(252);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO_SYM() { return getToken(JavaToCParser.DO_SYM, 0); }
		public TerminalNode WHILE_SYM() { return getToken(JavaToCParser.WHILE_SYM, 0); }
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(DO_SYM);
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE_SYM:
				{
				setState(258);
				loopBlock();
				}
				break;
			case BOOLEAN_SYM:
			case BREAK_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case CONTINUE_SYM:
			case DO_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case FOR_SYM:
			case IF_SYM:
			case LONG_SYM:
			case RETURN_SYM:
			case SHORT_SYM:
			case WHILE_SYM:
			case TRUE_SYM:
			case FALSE_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
			case INCREMENT_SYM:
			case DECREMENT_SYM:
			case LEFT_PARENTHESE_SYM:
			case MINUS_SYM:
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case LINE_COMMENT:
			case COMMENT:
				{
				setState(259);
				loopStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			match(WHILE_SYM);
			setState(263);
			match(LEFT_PARENTHESE_SYM);
			setState(264);
			logicalExpression(0);
			setState(265);
			match(RIGHT_PARENTHESE_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileDoStatementContext extends ParserRuleContext {
		public TerminalNode WHILE_SYM() { return getToken(JavaToCParser.WHILE_SYM, 0); }
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public WhileDoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterWhileDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitWhileDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitWhileDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDoStatementContext whileDoStatement() throws RecognitionException {
		WhileDoStatementContext _localctx = new WhileDoStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileDoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(WHILE_SYM);
			setState(268);
			match(LEFT_PARENTHESE_SYM);
			setState(269);
			logicalExpression(0);
			setState(270);
			match(RIGHT_PARENTHESE_SYM);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE_SYM:
				{
				setState(271);
				loopBlock();
				}
				break;
			case BOOLEAN_SYM:
			case BREAK_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case CONTINUE_SYM:
			case DO_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case FOR_SYM:
			case IF_SYM:
			case LONG_SYM:
			case RETURN_SYM:
			case SHORT_SYM:
			case WHILE_SYM:
			case TRUE_SYM:
			case FALSE_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
			case INCREMENT_SYM:
			case DECREMENT_SYM:
			case LEFT_PARENTHESE_SYM:
			case MINUS_SYM:
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case LINE_COMMENT:
			case COMMENT:
				{
				setState(272);
				loopStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT_SYM() { return getToken(JavaToCParser.ASSIGNMENT_SYM, 0); }
		public TerminalNode ASSIGN_MULTIPLICATION_SYM() { return getToken(JavaToCParser.ASSIGN_MULTIPLICATION_SYM, 0); }
		public TerminalNode ASSIGN_DIVISION_SYM() { return getToken(JavaToCParser.ASSIGN_DIVISION_SYM, 0); }
		public TerminalNode ASSIGN_MODULO_SYM() { return getToken(JavaToCParser.ASSIGN_MODULO_SYM, 0); }
		public TerminalNode ASSIGN_PLUS_SYM() { return getToken(JavaToCParser.ASSIGN_PLUS_SYM, 0); }
		public TerminalNode ASSIGN_MINUS_SYM() { return getToken(JavaToCParser.ASSIGN_MINUS_SYM, 0); }
		public TerminalNode ASSIGN_LEFT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.ASSIGN_LEFT_BIT_SHIFT_SYM, 0); }
		public TerminalNode ASSIGN_RIGHT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.ASSIGN_RIGHT_BIT_SHIFT_SYM, 0); }
		public TerminalNode ASSIGN_UN_RIGHT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.ASSIGN_UN_RIGHT_BIT_SHIFT_SYM, 0); }
		public TerminalNode ASSIGN_BITWISE_AND_SYM() { return getToken(JavaToCParser.ASSIGN_BITWISE_AND_SYM, 0); }
		public TerminalNode ASSIGN_BITWISE_EX_OR_SYM() { return getToken(JavaToCParser.ASSIGN_BITWISE_EX_OR_SYM, 0); }
		public TerminalNode ASSIGN_BITWISE_IN_OR_SYM() { return getToken(JavaToCParser.ASSIGN_BITWISE_IN_OR_SYM, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (ASSIGN_LEFT_BIT_SHIFT_SYM - 27)) | (1L << (ASSIGN_RIGHT_BIT_SHIFT_SYM - 27)) | (1L << (ASSIGN_UN_RIGHT_BIT_SHIFT_SYM - 27)) | (1L << (ASSIGN_BITWISE_AND_SYM - 27)) | (1L << (ASSIGN_BITWISE_EX_OR_SYM - 27)) | (1L << (ASSIGN_BITWISE_IN_OR_SYM - 27)) | (1L << (ASSIGN_PLUS_SYM - 27)) | (1L << (ASSIGN_MINUS_SYM - 27)) | (1L << (ASSIGN_MULTIPLICATION_SYM - 27)) | (1L << (ASSIGN_DIVISION_SYM - 27)) | (1L << (ASSIGN_MODULO_SYM - 27)) | (1L << (ASSIGNMENT_SYM - 27)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public BitExpressionContext bitExpression() {
			return getRuleContext(BitExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PreIncrementationExpressionContext preIncrementationExpression() {
			return getRuleContext(PreIncrementationExpressionContext.class,0);
		}
		public PostIncrementationExpressionContext postIncrementationExpression() {
			return getRuleContext(PostIncrementationExpressionContext.class,0);
		}
		public PreDecrementationExpressionContext preDecrementationExpression() {
			return getRuleContext(PreDecrementationExpressionContext.class,0);
		}
		public PostDecrementationExpressionContext postDecrementationExpression() {
			return getRuleContext(PostDecrementationExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				arithmeticExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				logicalExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				bitExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				assignmentExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				preIncrementationExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				postIncrementationExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				preDecrementationExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				postDecrementationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			assignmentExpression();
			setState(288);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public List<FunctionExecutionContext> functionExecution() {
			return getRuleContexts(FunctionExecutionContext.class);
		}
		public FunctionExecutionContext functionExecution(int i) {
			return getRuleContext(FunctionExecutionContext.class,i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ASSIGNMENT_SYM() { return getTokens(JavaToCParser.ASSIGNMENT_SYM); }
		public TerminalNode ASSIGNMENT_SYM(int i) {
			return getToken(JavaToCParser.ASSIGNMENT_SYM, i);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(290);
					match(ID);
					}
					break;
				case 2:
					{
					setState(291);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(292);
					arrayElement();
					}
					break;
				}
				setState(295);
				assignmentOperator();
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(296);
					match(ID);
					}
					break;
				case 2:
					{
					setState(297);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(298);
					arrayElement();
					}
					break;
				case 4:
					{
					setState(299);
					expression();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(302);
					match(ID);
					}
					break;
				case 2:
					{
					setState(303);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(304);
					arrayElement();
					}
					break;
				}
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(307);
					match(ASSIGNMENT_SYM);
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(308);
						match(ID);
						}
						break;
					case 2:
						{
						setState(309);
						functionExecution();
						}
						break;
					case 3:
						{
						setState(310);
						arrayElement();
						}
						break;
					}
					}
					}
					setState(315); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASSIGNMENT_SYM );
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(317);
					expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public TerminalNode FOR_SYM() { return getToken(JavaToCParser.FOR_SYM, 0); }
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public List<TerminalNode> SEMICOLON_SYM() { return getTokens(JavaToCParser.SEMICOLON_SYM); }
		public TerminalNode SEMICOLON_SYM(int i) {
			return getToken(JavaToCParser.SEMICOLON_SYM, i);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				enhancedForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(FOR_SYM);
				setState(324);
				match(LEFT_PARENTHESE_SYM);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << LONG_SYM) | (1L << SHORT_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM))) != 0) || _la==ID) {
					{
					setState(325);
					forInit();
					}
				}

				setState(328);
				match(SEMICOLON_SYM);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (TRUE_SYM - 20)) | (1L << (FALSE_SYM - 20)) | (1L << (LEFT_PARENTHESE_SYM - 20)) | (1L << (MINUS_SYM - 20)) | (1L << (ID - 20)) | (1L << (INTEGER_NUMBER - 20)) | (1L << (FLOAT_NUMBER - 20)))) != 0)) {
					{
					setState(329);
					logicalExpression(0);
					}
				}

				setState(332);
				match(SEMICOLON_SYM);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(333);
					forUpdate();
					}
				}

				setState(336);
				match(RIGHT_PARENTHESE_SYM);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_BRACE_SYM:
					{
					setState(337);
					loopBlock();
					}
					break;
				case BOOLEAN_SYM:
				case BREAK_SYM:
				case BYTE_SYM:
				case CHAR_SYM:
				case CONTINUE_SYM:
				case DO_SYM:
				case DOUBLE_SYM:
				case FLOAT_SYM:
				case FOR_SYM:
				case IF_SYM:
				case LONG_SYM:
				case RETURN_SYM:
				case SHORT_SYM:
				case WHILE_SYM:
				case TRUE_SYM:
				case FALSE_SYM:
				case STRING_SYM:
				case INTEGER_SYM:
				case INCREMENT_SYM:
				case DECREMENT_SYM:
				case LEFT_PARENTHESE_SYM:
				case MINUS_SYM:
				case ID:
				case INTEGER_NUMBER:
				case FLOAT_NUMBER:
				case LINE_COMMENT:
				case COMMENT:
					{
					setState(338);
					loopStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclarationWithoutSemicolonContext variableDeclarationWithoutSemicolon() {
			return getRuleContext(VariableDeclarationWithoutSemicolonContext.class,0);
		}
		public List<TerminalNode> ASSIGNMENT_SYM() { return getTokens(JavaToCParser.ASSIGNMENT_SYM); }
		public TerminalNode ASSIGNMENT_SYM(int i) {
			return getToken(JavaToCParser.ASSIGNMENT_SYM, i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public List<FunctionExecutionContext> functionExecution() {
			return getRuleContexts(FunctionExecutionContext.class);
		}
		public FunctionExecutionContext functionExecution(int i) {
			return getRuleContext(FunctionExecutionContext.class,i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public NumberEquivalentContext numberEquivalent() {
			return getRuleContext(NumberEquivalentContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(JavaToCParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(JavaToCParser.STRING, 0); }
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forInit);
		int _la;
		try {
			int _alt;
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				variableDeclarationWithoutSemicolon();
				setState(350); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(344);
						match(ASSIGNMENT_SYM);
						setState(348);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
						case 1:
							{
							setState(345);
							match(ID);
							}
							break;
						case 2:
							{
							setState(346);
							functionExecution();
							}
							break;
						case 3:
							{
							setState(347);
							arrayElement();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(352); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT_SYM) {
					{
					setState(354);
					match(ASSIGNMENT_SYM);
					setState(358);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
					case INTEGER_NUMBER:
					case FLOAT_NUMBER:
						{
						setState(355);
						numberEquivalent();
						}
						break;
					case CHAR:
						{
						setState(356);
						match(CHAR);
						}
						break;
					case STRING:
						{
						setState(357);
						match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(362);
					match(ID);
					}
					break;
				case 2:
					{
					setState(363);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(364);
					arrayElement();
					}
					break;
				}
				setState(373); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(367);
						match(ASSIGNMENT_SYM);
						setState(371);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(368);
							match(ID);
							}
							break;
						case 2:
							{
							setState(369);
							functionExecution();
							}
							break;
						case 3:
							{
							setState(370);
							arrayElement();
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(375); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT_SYM) {
					{
					setState(377);
					match(ASSIGNMENT_SYM);
					setState(384);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(378);
						numberEquivalent();
						}
						break;
					case 2:
						{
						setState(379);
						match(CHAR);
						}
						break;
					case 3:
						{
						setState(380);
						match(STRING);
						}
						break;
					case 4:
						{
						setState(381);
						match(ID);
						}
						break;
					case 5:
						{
						setState(382);
						functionExecution();
						}
						break;
					case 6:
						{
						setState(383);
						arrayElement();
						}
						break;
					}
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				variableDeclarationWithoutSemicolon();
				setState(389);
				match(ASSIGNMENT_SYM);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(390);
					numberEquivalent();
					}
					break;
				case 2:
					{
					setState(391);
					match(CHAR);
					}
					break;
				case 3:
					{
					setState(392);
					match(STRING);
					}
					break;
				case 4:
					{
					setState(393);
					match(ID);
					}
					break;
				case 5:
					{
					setState(394);
					functionExecution();
					}
					break;
				case 6:
					{
					setState(395);
					arrayElement();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYM() { return getTokens(JavaToCParser.COMMA_SYM); }
		public TerminalNode COMMA_SYM(int i) {
			return getToken(JavaToCParser.COMMA_SYM, i);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forUpdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(400);
				assignmentExpression();
				}
				}
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYM) {
				{
				{
				setState(405);
				match(COMMA_SYM);
				setState(406);
				assignmentExpression();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public TerminalNode FOR_SYM() { return getToken(JavaToCParser.FOR_SYM, 0); }
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public TerminalNode COLON_SYM() { return getToken(JavaToCParser.COLON_SYM, 0); }
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitEnhancedForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitEnhancedForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_enhancedForStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(FOR_SYM);
			setState(413);
			match(LEFT_PARENTHESE_SYM);
			setState(414);
			type();
			setState(415);
			match(ID);
			setState(416);
			match(COLON_SYM);
			setState(417);
			match(ID);
			setState(418);
			match(RIGHT_PARENTHESE_SYM);
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE_SYM:
				{
				setState(419);
				block();
				}
				break;
			case BOOLEAN_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case DO_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case FOR_SYM:
			case IF_SYM:
			case LONG_SYM:
			case RETURN_SYM:
			case SHORT_SYM:
			case WHILE_SYM:
			case TRUE_SYM:
			case FALSE_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
			case INCREMENT_SYM:
			case DECREMENT_SYM:
			case LEFT_PARENTHESE_SYM:
			case MINUS_SYM:
			case ID:
			case INTEGER_NUMBER:
			case FLOAT_NUMBER:
			case LINE_COMMENT:
			case COMMENT:
				{
				setState(420);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN_SYM() { return getToken(JavaToCParser.RETURN_SYM, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(RETURN_SYM);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (TRUE_SYM - 20)) | (1L << (FALSE_SYM - 20)) | (1L << (INCREMENT_SYM - 20)) | (1L << (DECREMENT_SYM - 20)) | (1L << (LEFT_PARENTHESE_SYM - 20)) | (1L << (MINUS_SYM - 20)) | (1L << (ID - 20)) | (1L << (INTEGER_NUMBER - 20)) | (1L << (FLOAT_NUMBER - 20)))) != 0)) {
				{
				setState(424);
				expression();
				}
			}

			setState(427);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK_SYM() { return getToken(JavaToCParser.BREAK_SYM, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(BREAK_SYM);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(430);
				match(ID);
				}
			}

			setState(433);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE_SYM() { return getToken(JavaToCParser.CONTINUE_SYM, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(CONTINUE_SYM);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(436);
				match(ID);
				}
			}

			setState(439);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID_SYM() { return getToken(JavaToCParser.VOID_SYM, 0); }
		public TerminalNode LEFT_BRACKET_SYM() { return getToken(JavaToCParser.LEFT_BRACKET_SYM, 0); }
		public TerminalNode RIGHT_BRACKET_SYM() { return getToken(JavaToCParser.RIGHT_BRACKET_SYM, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN_SYM:
			case BYTE_SYM:
			case CHAR_SYM:
			case DOUBLE_SYM:
			case FLOAT_SYM:
			case LONG_SYM:
			case SHORT_SYM:
			case STRING_SYM:
			case INTEGER_SYM:
				{
				setState(441);
				type();
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET_SYM) {
					{
					setState(442);
					match(LEFT_BRACKET_SYM);
					setState(443);
					match(RIGHT_BRACKET_SYM);
					}
				}

				}
				break;
			case VOID_SYM:
				{
				setState(446);
				match(VOID_SYM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			match(ID);
			setState(450);
			match(LEFT_PARENTHESE_SYM);
			setState(451);
			parameterList();
			setState(452);
			match(RIGHT_PARENTHESE_SYM);
			setState(453);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExecutionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public TerminalNode LEFT_PARENTHESE_SYM() { return getToken(JavaToCParser.LEFT_PARENTHESE_SYM, 0); }
		public TerminalNode RIGHT_PARENTHESE_SYM() { return getToken(JavaToCParser.RIGHT_PARENTHESE_SYM, 0); }
		public List<FunctionExecutionContext> functionExecution() {
			return getRuleContexts(FunctionExecutionContext.class);
		}
		public FunctionExecutionContext functionExecution(int i) {
			return getRuleContext(FunctionExecutionContext.class,i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA_SYM() { return getTokens(JavaToCParser.COMMA_SYM); }
		public TerminalNode COMMA_SYM(int i) {
			return getToken(JavaToCParser.COMMA_SYM, i);
		}
		public FunctionExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterFunctionExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitFunctionExecution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitFunctionExecution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExecutionContext functionExecution() throws RecognitionException {
		FunctionExecutionContext _localctx = new FunctionExecutionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(ID);
			setState(456);
			match(LEFT_PARENTHESE_SYM);
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(462);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(457);
					match(ID);
					}
					break;
				case 2:
					{
					setState(458);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(459);
					arrayElement();
					}
					break;
				case 4:
					{
					setState(460);
					number();
					}
					break;
				case 5:
					{
					}
					break;
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYM) {
					{
					{
					setState(464);
					match(COMMA_SYM);
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(465);
						match(ID);
						}
						break;
					case 2:
						{
						setState(466);
						functionExecution();
						}
						break;
					case 3:
						{
						setState(467);
						arrayElement();
						}
						break;
					case 4:
						{
						setState(468);
						number();
						}
						break;
					}
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(478);
			match(RIGHT_PARENTHESE_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionExecutionWithSemicolonContext extends ParserRuleContext {
		public FunctionExecutionContext functionExecution() {
			return getRuleContext(FunctionExecutionContext.class,0);
		}
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public FunctionExecutionWithSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionExecutionWithSemicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterFunctionExecutionWithSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitFunctionExecutionWithSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitFunctionExecutionWithSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionExecutionWithSemicolonContext functionExecutionWithSemicolon() throws RecognitionException {
		FunctionExecutionWithSemicolonContext _localctx = new FunctionExecutionWithSemicolonContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionExecutionWithSemicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			functionExecution();
			setState(481);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public List<TerminalNode> LEFT_BRACKET_SYM() { return getTokens(JavaToCParser.LEFT_BRACKET_SYM); }
		public TerminalNode LEFT_BRACKET_SYM(int i) {
			return getToken(JavaToCParser.LEFT_BRACKET_SYM, i);
		}
		public List<TerminalNode> RIGHT_BRACKET_SYM() { return getTokens(JavaToCParser.RIGHT_BRACKET_SYM); }
		public TerminalNode RIGHT_BRACKET_SYM(int i) {
			return getToken(JavaToCParser.RIGHT_BRACKET_SYM, i);
		}
		public List<TerminalNode> COMMA_SYM() { return getTokens(JavaToCParser.COMMA_SYM); }
		public TerminalNode COMMA_SYM(int i) {
			return getToken(JavaToCParser.COMMA_SYM, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_SYM) | (1L << BYTE_SYM) | (1L << CHAR_SYM) | (1L << DOUBLE_SYM) | (1L << FLOAT_SYM) | (1L << LONG_SYM) | (1L << SHORT_SYM) | (1L << STRING_SYM) | (1L << INTEGER_SYM))) != 0)) {
				{
				setState(483);
				type();
				setState(484);
				match(ID);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET_SYM) {
					{
					setState(485);
					match(LEFT_BRACKET_SYM);
					setState(486);
					match(RIGHT_BRACKET_SYM);
					}
				}

				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYM) {
					{
					{
					setState(489);
					match(COMMA_SYM);
					setState(490);
					type();
					setState(491);
					match(ID);
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEFT_BRACKET_SYM) {
						{
						setState(492);
						match(LEFT_BRACKET_SYM);
						setState(493);
						match(RIGHT_BRACKET_SYM);
						}
					}

					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitOperatorContext extends ParserRuleContext {
		public TerminalNode UN_RIGHT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.UN_RIGHT_BIT_SHIFT_SYM, 0); }
		public TerminalNode LEFT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.LEFT_BIT_SHIFT_SYM, 0); }
		public TerminalNode RIGHT_BIT_SHIFT_SYM() { return getToken(JavaToCParser.RIGHT_BIT_SHIFT_SYM, 0); }
		public TerminalNode BITWISE_AND_SYM() { return getToken(JavaToCParser.BITWISE_AND_SYM, 0); }
		public TerminalNode BITWISE_IN_OR_SYM() { return getToken(JavaToCParser.BITWISE_IN_OR_SYM, 0); }
		public TerminalNode BITWISE_EX_OR_SYM() { return getToken(JavaToCParser.BITWISE_EX_OR_SYM, 0); }
		public BitOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterBitOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitBitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitBitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitOperatorContext bitOperator() throws RecognitionException {
		BitOperatorContext _localctx = new BitOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bitOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (UN_RIGHT_BIT_SHIFT_SYM - 26)) | (1L << (LEFT_BIT_SHIFT_SYM - 26)) | (1L << (RIGHT_BIT_SHIFT_SYM - 26)) | (1L << (BITWISE_AND_SYM - 26)) | (1L << (BITWISE_IN_OR_SYM - 26)) | (1L << (BITWISE_EX_OR_SYM - 26)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public List<FunctionExecutionContext> functionExecution() {
			return getRuleContexts(FunctionExecutionContext.class);
		}
		public FunctionExecutionContext functionExecution(int i) {
			return getRuleContext(FunctionExecutionContext.class,i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> INTEGER_NUMBER() { return getTokens(JavaToCParser.INTEGER_NUMBER); }
		public TerminalNode INTEGER_NUMBER(int i) {
			return getToken(JavaToCParser.INTEGER_NUMBER, i);
		}
		public List<BitOperatorContext> bitOperator() {
			return getRuleContexts(BitOperatorContext.class);
		}
		public BitOperatorContext bitOperator(int i) {
			return getRuleContext(BitOperatorContext.class,i);
		}
		public BitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterBitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitBitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitBitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExpressionContext bitExpression() throws RecognitionException {
		BitExpressionContext _localctx = new BitExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bitExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(505);
				match(ID);
				}
				break;
			case 2:
				{
				setState(506);
				functionExecution();
				}
				break;
			case 3:
				{
				setState(507);
				arrayElement();
				}
				break;
			case 4:
				{
				setState(508);
				match(INTEGER_NUMBER);
				}
				break;
			}
			setState(518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(511);
				bitOperator();
				setState(516);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(512);
					match(ID);
					}
					break;
				case 2:
					{
					setState(513);
					functionExecution();
					}
					break;
				case 3:
					{
					setState(514);
					arrayElement();
					}
					break;
				case 4:
					{
					setState(515);
					match(INTEGER_NUMBER);
					}
					break;
				}
				}
				}
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (UN_RIGHT_BIT_SHIFT_SYM - 26)) | (1L << (LEFT_BIT_SHIFT_SYM - 26)) | (1L << (RIGHT_BIT_SHIFT_SYM - 26)) | (1L << (BITWISE_AND_SYM - 26)) | (1L << (BITWISE_IN_OR_SYM - 26)) | (1L << (BITWISE_EX_OR_SYM - 26)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringNullAssignmentContext extends ParserRuleContext {
		public TerminalNode STRING_SYM() { return getToken(JavaToCParser.STRING_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public TerminalNode ASSIGNMENT_SYM() { return getToken(JavaToCParser.ASSIGNMENT_SYM, 0); }
		public TerminalNode NULL_SYM() { return getToken(JavaToCParser.NULL_SYM, 0); }
		public StringNullAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringNullAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterStringNullAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitStringNullAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitStringNullAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringNullAssignmentContext stringNullAssignment() throws RecognitionException {
		StringNullAssignmentContext _localctx = new StringNullAssignmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stringNullAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(STRING_SYM);
			setState(523);
			match(ID);
			setState(524);
			match(ASSIGNMENT_SYM);
			setState(525);
			match(NULL_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementationExpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT_SYM() { return getToken(JavaToCParser.INCREMENT_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public PreIncrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterPreIncrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitPreIncrementationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitPreIncrementationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreIncrementationExpressionContext preIncrementationExpression() throws RecognitionException {
		PreIncrementationExpressionContext _localctx = new PreIncrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_preIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(INCREMENT_SYM);
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(528);
				match(ID);
				}
				break;
			case 2:
				{
				setState(529);
				arrayElement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementationExpressionContext extends ParserRuleContext {
		public TerminalNode INCREMENT_SYM() { return getToken(JavaToCParser.INCREMENT_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public PostIncrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterPostIncrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitPostIncrementationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitPostIncrementationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostIncrementationExpressionContext postIncrementationExpression() throws RecognitionException {
		PostIncrementationExpressionContext _localctx = new PostIncrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_postIncrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(532);
				match(ID);
				}
				break;
			case 2:
				{
				setState(533);
				arrayElement();
				}
				break;
			}
			setState(536);
			match(INCREMENT_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementationExpressionContext extends ParserRuleContext {
		public TerminalNode DECREMENT_SYM() { return getToken(JavaToCParser.DECREMENT_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public PreDecrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterPreDecrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitPreDecrementationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitPreDecrementationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreDecrementationExpressionContext preDecrementationExpression() throws RecognitionException {
		PreDecrementationExpressionContext _localctx = new PreDecrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_preDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(DECREMENT_SYM);
			setState(541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(539);
				match(ID);
				}
				break;
			case 2:
				{
				setState(540);
				arrayElement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementationExpressionContext extends ParserRuleContext {
		public TerminalNode DECREMENT_SYM() { return getToken(JavaToCParser.DECREMENT_SYM, 0); }
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public PostDecrementationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterPostDecrementationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitPostDecrementationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitPostDecrementationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostDecrementationExpressionContext postDecrementationExpression() throws RecognitionException {
		PostDecrementationExpressionContext _localctx = new PostDecrementationExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_postDecrementationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(543);
				match(ID);
				}
				break;
			case 2:
				{
				setState(544);
				arrayElement();
				}
				break;
			}
			setState(547);
			match(DECREMENT_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JavaToCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JavaToCParser.ID, i);
		}
		public TerminalNode LEFT_BRACKET_SYM() { return getToken(JavaToCParser.LEFT_BRACKET_SYM, 0); }
		public TerminalNode RIGHT_BRACKET_SYM() { return getToken(JavaToCParser.RIGHT_BRACKET_SYM, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(JavaToCParser.INTEGER_NUMBER, 0); }
		public FunctionExecutionContext functionExecution() {
			return getRuleContext(FunctionExecutionContext.class,0);
		}
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PreDecrementationExpressionContext preDecrementationExpression() {
			return getRuleContext(PreDecrementationExpressionContext.class,0);
		}
		public PreIncrementationExpressionContext preIncrementationExpression() {
			return getRuleContext(PreIncrementationExpressionContext.class,0);
		}
		public PostDecrementationExpressionContext postDecrementationExpression() {
			return getRuleContext(PostDecrementationExpressionContext.class,0);
		}
		public PostIncrementationExpressionContext postIncrementationExpression() {
			return getRuleContext(PostIncrementationExpressionContext.class,0);
		}
		public ArrayVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterArrayVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitArrayVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitArrayVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableDeclarationContext arrayVariableDeclaration() throws RecognitionException {
		ArrayVariableDeclarationContext _localctx = new ArrayVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arrayVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			type();
			setState(550);
			match(ID);
			setState(551);
			match(LEFT_BRACKET_SYM);
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(552);
				match(INTEGER_NUMBER);
				}
				break;
			case 2:
				{
				setState(553);
				match(ID);
				}
				break;
			case 3:
				{
				setState(554);
				functionExecution();
				}
				break;
			case 4:
				{
				setState(555);
				arrayElement();
				}
				break;
			case 5:
				{
				setState(556);
				arithmeticExpression(0);
				}
				break;
			case 6:
				{
				setState(557);
				assignmentExpression();
				}
				break;
			case 7:
				{
				setState(558);
				preDecrementationExpression();
				}
				break;
			case 8:
				{
				setState(559);
				preIncrementationExpression();
				}
				break;
			case 9:
				{
				setState(560);
				postDecrementationExpression();
				}
				break;
			case 10:
				{
				setState(561);
				postIncrementationExpression();
				}
				break;
			}
			setState(564);
			match(RIGHT_BRACKET_SYM);
			setState(565);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayVariableDeclarationWithInitializationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public TerminalNode LEFT_BRACKET_SYM() { return getToken(JavaToCParser.LEFT_BRACKET_SYM, 0); }
		public TerminalNode RIGHT_BRACKET_SYM() { return getToken(JavaToCParser.RIGHT_BRACKET_SYM, 0); }
		public TerminalNode ASSIGNMENT_SYM() { return getToken(JavaToCParser.ASSIGNMENT_SYM, 0); }
		public TerminalNode LEFT_BRACE_SYM() { return getToken(JavaToCParser.LEFT_BRACE_SYM, 0); }
		public TerminalNode RIGHT_BRACE_SYM() { return getToken(JavaToCParser.RIGHT_BRACE_SYM, 0); }
		public TerminalNode SEMICOLON_SYM() { return getToken(JavaToCParser.SEMICOLON_SYM, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYM() { return getTokens(JavaToCParser.COMMA_SYM); }
		public TerminalNode COMMA_SYM(int i) {
			return getToken(JavaToCParser.COMMA_SYM, i);
		}
		public ArrayVariableDeclarationWithInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayVariableDeclarationWithInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterArrayVariableDeclarationWithInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitArrayVariableDeclarationWithInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitArrayVariableDeclarationWithInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayVariableDeclarationWithInitializationContext arrayVariableDeclarationWithInitialization() throws RecognitionException {
		ArrayVariableDeclarationWithInitializationContext _localctx = new ArrayVariableDeclarationWithInitializationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayVariableDeclarationWithInitialization);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			type();
			setState(568);
			match(ID);
			setState(569);
			match(LEFT_BRACKET_SYM);
			setState(570);
			match(RIGHT_BRACKET_SYM);
			setState(571);
			match(ASSIGNMENT_SYM);
			setState(572);
			match(LEFT_BRACE_SYM);
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(573);
						expression();
						setState(574);
						match(COMMA_SYM);
						}
						} 
					}
					setState(580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (TRUE_SYM - 20)) | (1L << (FALSE_SYM - 20)) | (1L << (INCREMENT_SYM - 20)) | (1L << (DECREMENT_SYM - 20)) | (1L << (LEFT_PARENTHESE_SYM - 20)) | (1L << (MINUS_SYM - 20)) | (1L << (ID - 20)) | (1L << (INTEGER_NUMBER - 20)) | (1L << (FLOAT_NUMBER - 20)))) != 0)) {
					{
					setState(581);
					expression();
					}
				}

				}
				break;
			case 2:
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYM) {
					{
					setState(584);
					match(COMMA_SYM);
					}
				}

				}
				break;
			case 3:
				{
				setState(587);
				expression();
				}
				break;
			}
			setState(590);
			match(RIGHT_BRACE_SYM);
			setState(591);
			match(SEMICOLON_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaToCParser.ID, 0); }
		public TerminalNode LEFT_BRACKET_SYM() { return getToken(JavaToCParser.LEFT_BRACKET_SYM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET_SYM() { return getToken(JavaToCParser.RIGHT_BRACKET_SYM, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaToCParserListener ) ((JavaToCParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaToCParserVisitor ) return ((JavaToCParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(ID);
			setState(594);
			match(LEFT_BRACKET_SYM);
			setState(595);
			expression();
			setState(596);
			match(RIGHT_BRACKET_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 12:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u0259\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5x\n"+
		"\5\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0087\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0099\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00b7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c0\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ce"+
		"\n\16\f\16\16\16\u00d1\13\16\3\17\3\17\3\20\3\20\7\20\u00d7\n\20\f\20"+
		"\16\20\u00da\13\20\3\20\3\20\3\21\3\21\7\21\u00e0\n\21\f\21\16\21\u00e3"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ed\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f6\n\22\7\22\u00f8\n\22\f\22\16\22"+
		"\u00fb\13\22\3\22\3\22\3\22\5\22\u0100\n\22\5\22\u0102\n\22\3\23\3\23"+
		"\3\23\5\23\u0107\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0114\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0120\n\26\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0128\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u012f\n\30\3\30\3\30\3\30\5\30\u0134\n\30\3\30"+
		"\3\30\3\30\3\30\5\30\u013a\n\30\6\30\u013c\n\30\r\30\16\30\u013d\3\30"+
		"\5\30\u0141\n\30\5\30\u0143\n\30\3\31\3\31\3\31\3\31\5\31\u0149\n\31\3"+
		"\31\3\31\5\31\u014d\n\31\3\31\3\31\5\31\u0151\n\31\3\31\3\31\3\31\5\31"+
		"\u0156\n\31\5\31\u0158\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u015f\n\32\6"+
		"\32\u0161\n\32\r\32\16\32\u0162\3\32\3\32\3\32\3\32\5\32\u0169\n\32\5"+
		"\32\u016b\n\32\3\32\3\32\3\32\5\32\u0170\n\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0176\n\32\6\32\u0178\n\32\r\32\16\32\u0179\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0183\n\32\5\32\u0185\n\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u018f\n\32\5\32\u0191\n\32\3\33\6\33\u0194\n\33\r\33"+
		"\16\33\u0195\3\33\3\33\7\33\u019a\n\33\f\33\16\33\u019d\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01a8\n\34\3\35\3\35\5\35\u01ac"+
		"\n\35\3\35\3\35\3\36\3\36\5\36\u01b2\n\36\3\36\3\36\3\37\3\37\5\37\u01b8"+
		"\n\37\3\37\3\37\3 \3 \3 \5 \u01bf\n \3 \5 \u01c2\n \3 \3 \3 \3 \3 \3 "+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u01d1\n!\3!\3!\3!\3!\3!\5!\u01d8\n!\7!\u01da"+
		"\n!\f!\16!\u01dd\13!\5!\u01df\n!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u01ea"+
		"\n#\3#\3#\3#\3#\3#\5#\u01f1\n#\7#\u01f3\n#\f#\16#\u01f6\13#\5#\u01f8\n"+
		"#\3$\3$\3%\3%\3%\3%\5%\u0200\n%\3%\3%\3%\3%\3%\5%\u0207\n%\6%\u0209\n"+
		"%\r%\16%\u020a\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0215\n\'\3(\3(\5(\u0219"+
		"\n(\3(\3(\3)\3)\3)\5)\u0220\n)\3*\3*\5*\u0224\n*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0235\n+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\7,\u0243\n,\f,\16,\u0246\13,\3,\5,\u0249\n,\3,\5,\u024c\n,\3,\5,\u024f"+
		"\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\2\4\26\32.\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\b\4\2**DG\3\2MN\3\2"+
		"\26\27\n\2\3\3\5\5\7\7\13\13\r\r\20\20\22\22\31\32\6\2\35\"().\60CC\6"+
		"\2\34\34,->?KK\2\u02b7\2]\3\2\2\2\4`\3\2\2\2\6d\3\2\2\2\bw\3\2\2\2\n|"+
		"\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2"+
		"\24\u008e\3\2\2\2\26\u0098\3\2\2\2\30\u00b6\3\2\2\2\32\u00bf\3\2\2\2\34"+
		"\u00d2\3\2\2\2\36\u00d4\3\2\2\2 \u00dd\3\2\2\2\"\u00e6\3\2\2\2$\u0103"+
		"\3\2\2\2&\u010d\3\2\2\2(\u0115\3\2\2\2*\u011f\3\2\2\2,\u0121\3\2\2\2."+
		"\u0142\3\2\2\2\60\u0157\3\2\2\2\62\u0190\3\2\2\2\64\u0193\3\2\2\2\66\u019e"+
		"\3\2\2\28\u01a9\3\2\2\2:\u01af\3\2\2\2<\u01b5\3\2\2\2>\u01c1\3\2\2\2@"+
		"\u01c9\3\2\2\2B\u01e2\3\2\2\2D\u01f7\3\2\2\2F\u01f9\3\2\2\2H\u01ff\3\2"+
		"\2\2J\u020c\3\2\2\2L\u0211\3\2\2\2N\u0218\3\2\2\2P\u021c\3\2\2\2R\u0223"+
		"\3\2\2\2T\u0227\3\2\2\2V\u0239\3\2\2\2X\u0253\3\2\2\2Z\\\5> \2[Z\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]\3\2\2\2`a\5\34\17\2ab\7"+
		"L\2\2bc\7\65\2\2c\5\3\2\2\2de\5\34\17\2ef\7L\2\2f\7\3\2\2\2gx\7S\2\2h"+
		"x\7T\2\2ix\5\4\3\2jx\5T+\2kx\5V,\2lx\5\"\22\2mx\5&\24\2nx\5$\23\2ox\5"+
		"\60\31\2px\5\66\34\2qx\58\35\2rx\5,\27\2st\5*\26\2tu\7\65\2\2ux\3\2\2"+
		"\2vx\5B\"\2wg\3\2\2\2wh\3\2\2\2wi\3\2\2\2wj\3\2\2\2wk\3\2\2\2wl\3\2\2"+
		"\2wm\3\2\2\2wn\3\2\2\2wo\3\2\2\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2"+
		"\2wv\3\2\2\2x\t\3\2\2\2y}\5\b\5\2z}\5:\36\2{}\5<\37\2|y\3\2\2\2|z\3\2"+
		"\2\2|{\3\2\2\2}\13\3\2\2\2~\177\t\2\2\2\177\r\3\2\2\2\u0080\u0081\t\3"+
		"\2\2\u0081\17\3\2\2\2\u0082\u0087\5\16\b\2\u0083\u0087\7L\2\2\u0084\u0087"+
		"\5@!\2\u0085\u0087\5X-\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\21\3\2\2\2\u0088\u0089\t\4\2"+
		"\2\u0089\23\3\2\2\2\u008a\u008f\5\22\n\2\u008b\u008f\7L\2\2\u008c\u008f"+
		"\5@!\2\u008d\u008f\5X-\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\b\f\1"+
		"\2\u0091\u0092\7;\2\2\u0092\u0099\5\26\f\n\u0093\u0094\7\61\2\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0096\7\62\2\2\u0096\u0099\3\2\2\2\u0097\u0099\5"+
		"\20\t\2\u0098\u0090\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u00ab\3\2\2\2\u009a\u009b\f\t\2\2\u009b\u009c\7<\2\2\u009c\u00aa\5\26"+
		"\f\n\u009d\u009e\f\b\2\2\u009e\u009f\7=\2\2\u009f\u00aa\5\26\f\t\u00a0"+
		"\u00a1\f\7\2\2\u00a1\u00a2\7:\2\2\u00a2\u00aa\5\26\f\b\u00a3\u00a4\f\6"+
		"\2\2\u00a4\u00a5\7;\2\2\u00a5\u00aa\5\26\f\7\u00a6\u00a7\f\5\2\2\u00a7"+
		"\u00a8\7@\2\2\u00a8\u00aa\5\26\f\6\u00a9\u009a\3\2\2\2\u00a9\u009d\3\2"+
		"\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\27\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\5\f\7\2\u00b0"+
		"\u00b1\5\26\f\2\u00b1\u00b7\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\5"+
		"\30\r\2\u00b4\u00b5\7\62\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\b\16\1\2\u00b9\u00c0\5\30"+
		"\r\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\7\62\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00c0\5\24\13\2\u00bf\u00b8\3\2\2\2\u00bf\u00ba\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00cf\3\2\2\2\u00c1\u00c2\f\t\2\2\u00c2"+
		"\u00c3\7$\2\2\u00c3\u00ce\5\32\16\n\u00c4\u00c5\f\b\2\2\u00c5\u00c6\7"+
		"%\2\2\u00c6\u00ce\5\32\16\t\u00c7\u00c8\f\7\2\2\u00c8\u00c9\7>\2\2\u00c9"+
		"\u00ce\5\32\16\b\u00ca\u00cb\f\6\2\2\u00cb\u00cc\7?\2\2\u00cc\u00ce\5"+
		"\32\16\7\u00cd\u00c1\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\33\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3\35"+
		"\3\2\2\2\u00d4\u00d8\7\63\2\2\u00d5\u00d7\5\b\5\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\64\2\2\u00dc\37\3\2\2\2\u00dd"+
		"\u00e1\7\63\2\2\u00de\u00e0\5\n\6\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\64\2\2\u00e5!\3\2\2\2\u00e6\u00e7\7\17\2"+
		"\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ec\7\62\2\2\u00ea"+
		"\u00ed\5\36\20\2\u00eb\u00ed\5\b\5\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\7\17\2\2\u00f0"+
		"\u00f1\7\61\2\2\u00f1\u00f2\5\32\16\2\u00f2\u00f5\7\62\2\2\u00f3\u00f6"+
		"\5\36\20\2\u00f4\u00f6\5\b\5\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2"+
		"\u00f6\u00f8\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0101\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\7\f\2\2\u00fd\u0100\5\36\20\2\u00fe\u0100\5\b\5\2\u00ff\u00fd\3"+
		"\2\2\2\u00ff\u00fe\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00fc\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102#\3\2\2\2\u0103\u0106\7\n\2\2\u0104\u0107\5 \21\2"+
		"\u0105\u0107\5\n\6\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\7\25\2\2\u0109\u010a\7\61\2\2\u010a\u010b\5\32\16"+
		"\2\u010b\u010c\7\62\2\2\u010c%\3\2\2\2\u010d\u010e\7\25\2\2\u010e\u010f"+
		"\7\61\2\2\u010f\u0110\5\32\16\2\u0110\u0113\7\62\2\2\u0111\u0114\5 \21"+
		"\2\u0112\u0114\5\n\6\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\'"+
		"\3\2\2\2\u0115\u0116\t\6\2\2\u0116)\3\2\2\2\u0117\u0120\5\26\f\2\u0118"+
		"\u0120\5\32\16\2\u0119\u0120\5H%\2\u011a\u0120\5.\30\2\u011b\u0120\5L"+
		"\'\2\u011c\u0120\5N(\2\u011d\u0120\5P)\2\u011e\u0120\5R*\2\u011f\u0117"+
		"\3\2\2\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f"+
		"\u011b\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120+\3\2\2\2\u0121\u0122\5.\30\2\u0122\u0123\7\65\2\2\u0123-\3"+
		"\2\2\2\u0124\u0128\7L\2\2\u0125\u0128\5@!\2\u0126\u0128\5X-\2\u0127\u0124"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012e\5(\25\2\u012a\u012f\7L\2\2\u012b\u012f\5@!\2\u012c\u012f\5X-\2"+
		"\u012d\u012f\5*\26\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0143\3\2\2\2\u0130\u0134\7L\2\2\u0131"+
		"\u0134\5@!\2\u0132\u0134\5X-\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2"+
		"\u0133\u0132\3\2\2\2\u0134\u013b\3\2\2\2\u0135\u0139\7C\2\2\u0136\u013a"+
		"\7L\2\2\u0137\u013a\5@!\2\u0138\u013a\5X-\2\u0139\u0136\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0135\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u0141\5*\26\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0143\3\2\2\2\u0142\u0127\3\2\2\2\u0142\u0133\3\2\2\2\u0143"+
		"/\3\2\2\2\u0144\u0158\5\66\34\2\u0145\u0146\7\16\2\2\u0146\u0148\7\61"+
		"\2\2\u0147\u0149\5\62\32\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\7\65\2\2\u014b\u014d\5\32\16\2\u014c\u014b"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\65\2\2"+
		"\u014f\u0151\5\64\33\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0155\7\62\2\2\u0153\u0156\5 \21\2\u0154\u0156\5\n\6\2"+
		"\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0144"+
		"\3\2\2\2\u0157\u0145\3\2\2\2\u0158\61\3\2\2\2\u0159\u0160\5\6\4\2\u015a"+
		"\u015e\7C\2\2\u015b\u015f\7L\2\2\u015c\u015f\5@!\2\u015d\u015f\5X-\2\u015e"+
		"\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015a\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u016a\3\2\2\2\u0164\u0168\7C\2\2\u0165\u0169\5\20"+
		"\t\2\u0166\u0169\7P\2\2\u0167\u0169\7O\2\2\u0168\u0165\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0164\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0191\3\2\2\2\u016c\u0170\7L\2\2\u016d\u0170\5@!"+
		"\2\u016e\u0170\5X-\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e"+
		"\3\2\2\2\u0170\u0177\3\2\2\2\u0171\u0175\7C\2\2\u0172\u0176\7L\2\2\u0173"+
		"\u0176\5@!\2\u0174\u0176\5X-\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0171\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0184\3\2\2\2\u017b"+
		"\u0182\7C\2\2\u017c\u0183\5\20\t\2\u017d\u0183\7P\2\2\u017e\u0183\7O\2"+
		"\2\u017f\u0183\7L\2\2\u0180\u0183\5@!\2\u0181\u0183\5X-\2\u0182\u017c"+
		"\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0182\u017f\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u017b\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0191\3\2\2\2\u0186\u0187\5\6\4\2\u0187"+
		"\u018e\7C\2\2\u0188\u018f\5\20\t\2\u0189\u018f\7P\2\2\u018a\u018f\7O\2"+
		"\2\u018b\u018f\7L\2\2\u018c\u018f\5@!\2\u018d\u018f\5X-\2\u018e\u0188"+
		"\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018b\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0159\3\2"+
		"\2\2\u0190\u016f\3\2\2\2\u0190\u0186\3\2\2\2\u0191\63\3\2\2\2\u0192\u0194"+
		"\5.\30\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u019b\3\2\2\2\u0197\u0198\7\67\2\2\u0198\u019a\5"+
		".\30\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\65\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\16\2"+
		"\2\u019f\u01a0\7\61\2\2\u01a0\u01a1\5\34\17\2\u01a1\u01a2\7L\2\2\u01a2"+
		"\u01a3\7\66\2\2\u01a3\u01a4\7L\2\2\u01a4\u01a7\7\62\2\2\u01a5\u01a8\5"+
		"\36\20\2\u01a6\u01a8\5\b\5\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\67\3\2\2\2\u01a9\u01ab\7\21\2\2\u01aa\u01ac\5*\26\2\u01ab\u01aa\3\2\2"+
		"\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\7\65\2\2\u01ae"+
		"9\3\2\2\2\u01af\u01b1\7\4\2\2\u01b0\u01b2\7L\2\2\u01b1\u01b0\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\65\2\2\u01b4;\3\2\2\2"+
		"\u01b5\u01b7\7\t\2\2\u01b6\u01b8\7L\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\65\2\2\u01ba=\3\2\2\2\u01bb"+
		"\u01be\5\34\17\2\u01bc\u01bd\7H\2\2\u01bd\u01bf\7I\2\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c2\7\24\2\2\u01c1"+
		"\u01bb\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7L"+
		"\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\5D#\2\u01c6\u01c7\7\62\2\2\u01c7"+
		"\u01c8\5\36\20\2\u01c8?\3\2\2\2\u01c9\u01ca\7L\2\2\u01ca\u01de\7\61\2"+
		"\2\u01cb\u01d1\7L\2\2\u01cc\u01d1\5@!\2\u01cd\u01d1\5X-\2\u01ce\u01d1"+
		"\5\16\b\2\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2"+
		"\u01d0\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01db"+
		"\3\2\2\2\u01d2\u01d7\7\67\2\2\u01d3\u01d8\7L\2\2\u01d4\u01d8\5@!\2\u01d5"+
		"\u01d8\5X-\2\u01d6\u01d8\5\16\b\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01d2\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01d0\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\62\2\2\u01e1A\3\2\2\2"+
		"\u01e2\u01e3\5@!\2\u01e3\u01e4\7\65\2\2\u01e4C\3\2\2\2\u01e5\u01e6\5\34"+
		"\17\2\u01e6\u01e9\7L\2\2\u01e7\u01e8\7H\2\2\u01e8\u01ea\7I\2\2\u01e9\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f4\3\2\2\2\u01eb\u01ec\7\67\2\2"+
		"\u01ec\u01ed\5\34\17\2\u01ed\u01f0\7L\2\2\u01ee\u01ef\7H\2\2\u01ef\u01f1"+
		"\7I\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01eb\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01e5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8E\3\2\2\2\u01f9\u01fa\t\7\2\2\u01faG\3\2\2\2\u01fb"+
		"\u0200\7L\2\2\u01fc\u0200\5@!\2\u01fd\u0200\5X-\2\u01fe\u0200\7M\2\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2"+
		"\2\2\u0200\u0208\3\2\2\2\u0201\u0206\5F$\2\u0202\u0207\7L\2\2\u0203\u0207"+
		"\5@!\2\u0204\u0207\5X-\2\u0205\u0207\7M\2\2\u0206\u0202\3\2\2\2\u0206"+
		"\u0203\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u0209\3\2"+
		"\2\2\u0208\u0201\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020bI\3\2\2\2\u020c\u020d\7\31\2\2\u020d\u020e\7L\2\2"+
		"\u020e\u020f\7C\2\2\u020f\u0210\7\30\2\2\u0210K\3\2\2\2\u0211\u0214\7"+
		"&\2\2\u0212\u0215\7L\2\2\u0213\u0215\5X-\2\u0214\u0212\3\2\2\2\u0214\u0213"+
		"\3\2\2\2\u0215M\3\2\2\2\u0216\u0219\7L\2\2\u0217\u0219\5X-\2\u0218\u0216"+
		"\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7&\2\2\u021b"+
		"O\3\2\2\2\u021c\u021f\7\'\2\2\u021d\u0220\7L\2\2\u021e\u0220\5X-\2\u021f"+
		"\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220Q\3\2\2\2\u0221\u0224\7L\2\2\u0222"+
		"\u0224\5X-\2\u0223\u0221\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2"+
		"\2\u0225\u0226\7\'\2\2\u0226S\3\2\2\2\u0227\u0228\5\34\17\2\u0228\u0229"+
		"\7L\2\2\u0229\u0234\7H\2\2\u022a\u0235\7M\2\2\u022b\u0235\7L\2\2\u022c"+
		"\u0235\5@!\2\u022d\u0235\5X-\2\u022e\u0235\5\26\f\2\u022f\u0235\5.\30"+
		"\2\u0230\u0235\5P)\2\u0231\u0235\5L\'\2\u0232\u0235\5R*\2\u0233\u0235"+
		"\5N(\2\u0234\u022a\3\2\2\2\u0234\u022b\3\2\2\2\u0234\u022c\3\2\2\2\u0234"+
		"\u022d\3\2\2\2\u0234\u022e\3\2\2\2\u0234\u022f\3\2\2\2\u0234\u0230\3\2"+
		"\2\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\7I\2\2\u0237\u0238\7\65\2\2\u0238U\3\2\2\2"+
		"\u0239\u023a\5\34\17\2\u023a\u023b\7L\2\2\u023b\u023c\7H\2\2\u023c\u023d"+
		"\7I\2\2\u023d\u023e\7C\2\2\u023e\u024e\7\63\2\2\u023f\u0240\5*\26\2\u0240"+
		"\u0241\7\67\2\2\u0241\u0243\3\2\2\2\u0242\u023f\3\2\2\2\u0243\u0246\3"+
		"\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0247\u0249\5*\26\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u024f\3\2\2\2\u024a\u024c\7\67\2\2\u024b\u024a\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024f\5*\26\2\u024e\u0244\3\2"+
		"\2\2\u024e\u024b\3\2\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0251\7\64\2\2\u0251\u0252\7\65\2\2\u0252W\3\2\2\2\u0253\u0254\7L\2\2"+
		"\u0254\u0255\7H\2\2\u0255\u0256\5*\26\2\u0256\u0257\7I\2\2\u0257Y\3\2"+
		"\2\2K]w|\u0086\u008e\u0098\u00a9\u00ab\u00b6\u00bf\u00cd\u00cf\u00d8\u00e1"+
		"\u00ec\u00f5\u00f9\u00ff\u0101\u0106\u0113\u011f\u0127\u012e\u0133\u0139"+
		"\u013d\u0140\u0142\u0148\u014c\u0150\u0155\u0157\u015e\u0162\u0168\u016a"+
		"\u016f\u0175\u0179\u0182\u0184\u018e\u0190\u0195\u019b\u01a7\u01ab\u01b1"+
		"\u01b7\u01be\u01c1\u01d0\u01d7\u01db\u01de\u01e9\u01f0\u01f4\u01f7\u01ff"+
		"\u0206\u020a\u0214\u0218\u021f\u0223\u0234\u0244\u0248\u024b\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}