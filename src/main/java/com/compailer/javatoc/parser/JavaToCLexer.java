// Generated from JavaToCLexer.g4 by ANTLR 4.7.1

package com.compailer.javatoc.parser;
    
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaToCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN_SYM", "BREAK_SYM", "BYTE_SYM", "CASE_SYM", "CHAR_SYM", "CONST_SYM", 
		"CONTINUE_SYM", "DO_SYM", "DOUBLE_SYM", "ELSE_SYM", "FLOAT_SYM", "FOR_SYM", 
		"IF_SYM", "LONG_SYM", "RETURN_SYM", "SHORT_SYM", "SWITCH_SYM", "VOID_SYM", 
		"WHILE_SYM", "TRUE_SYM", "FALSE_SYM", "NULL_SYM", "STRING_SYM", "INTEGER_SYM", 
		"COMM_SYM", "UN_RIGHT_BIT_SHIFT_SYM", "ASSIGN_LEFT_BIT_SHIFT_SYM", "ASSIGN_RIGHT_BIT_SHIFT_SYM", 
		"ASSIGN_UN_RIGHT_BIT_SHIFT_SYM", "ASSIGN_BITWISE_AND_SYM", "ASSIGN_BITWISE_EX_OR_SYM", 
		"ASSIGN_BITWISE_IN_OR_SYM", "ASSIGN_LOGICAL_AND_SYM", "LOGICAL_AND_SYM", 
		"LOGICAL_OR_SYM", "INCREMENT_SYM", "DECREMENT_SYM", "ASSIGN_PLUS_SYM", 
		"ASSIGN_MINUS_SYM", "EQUALS_SYM", "NOT_EQUALS_SYM", "LEFT_BIT_SHIFT_SYM", 
		"RIGHT_BIT_SHIFT_SYM", "ASSIGN_MULTIPLICATION_SYM", "ASSIGN_DIVISION_SYM", 
		"ASSIGN_MODULO_SYM", "LEFT_PARENTHESE_SYM", "RIGHT_PARENTHESE_SYM", "LEFT_BRACE_SYM", 
		"RIGHT_BRACE_SYM", "SEMICOLON_SYM", "COLON_SYM", "COMMA_SYM", "DOT_SYM", 
		"QUESTION_MARK_SYM", "PLUS_SYM", "MINUS_SYM", "MULTIPLICATION_SYM", "DIVISION_SYM", 
		"BITWISE_AND_SYM", "BITWISE_IN_OR_SYM", "MODULO_SYM", "NEGATIVE_SYM", 
		"TWO_BACKSLASHES_SYM", "ASSIGNMENT_SYM", "GREATER_SYM", "GREATER_OR_EQUAL_SYM", 
		"LESS_SYM", "LESS_OR_EQUAL_SYM", "LEFT_BRACKET_SYM", "RIGHT_BRACKET_SYM", 
		"TILDE_SYM", "BITWISE_EX_OR_SYM", "ID", "INTEGER_NUMBER", "FLOAT_NUMBER", 
		"STRING", "CHAR", "WHITE_SPACES", "NEW_LINE", "LINE_COMMENT", "COMMENT", 
		"DIGIT", "LETTER"
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


	public JavaToCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaToCLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0211\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3"+
		"*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D"+
		"\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\5K\u01b5\nK\3K\3K\3K"+
		"\7K\u01ba\nK\fK\16K\u01bd\13K\3L\6L\u01c0\nL\rL\16L\u01c1\3M\6M\u01c5"+
		"\nM\rM\16M\u01c6\3M\3M\6M\u01cb\nM\rM\16M\u01cc\3M\5M\u01d0\nM\3M\3M\6"+
		"M\u01d4\nM\rM\16M\u01d5\3M\5M\u01d9\nM\5M\u01db\nM\3N\3N\7N\u01df\nN\f"+
		"N\16N\u01e2\13N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3Q\5Q\u01ef\nQ\3Q\3Q\6Q"+
		"\u01f3\nQ\rQ\16Q\u01f4\3Q\3Q\3R\3R\3R\3R\7R\u01fd\nR\fR\16R\u0200\13R"+
		"\3S\3S\3S\3S\7S\u0206\nS\fS\16S\u0209\13S\3S\3S\3S\3T\3T\3U\3U\4\u01e0"+
		"\u0207\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7\2\u00a9\2\3\2\7\4\2&&aa\5\2\13\f\17\17\""+
		"\"\b\2GGKKNNPPYYaa\3\2\62;\4\2C\\c|\2\u021f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\3\u00ab\3\2\2\2\5\u00b3\3\2\2\2\7\u00b9\3\2\2"+
		"\2\t\u00be\3\2\2\2\13\u00c3\3\2\2\2\r\u00c8\3\2\2\2\17\u00ce\3\2\2\2\21"+
		"\u00d7\3\2\2\2\23\u00da\3\2\2\2\25\u00e1\3\2\2\2\27\u00e6\3\2\2\2\31\u00ec"+
		"\3\2\2\2\33\u00f0\3\2\2\2\35\u00f3\3\2\2\2\37\u00f8\3\2\2\2!\u00ff\3\2"+
		"\2\2#\u0105\3\2\2\2%\u010c\3\2\2\2\'\u0111\3\2\2\2)\u0117\3\2\2\2+\u011c"+
		"\3\2\2\2-\u0122\3\2\2\2/\u0127\3\2\2\2\61\u012e\3\2\2\2\63\u0132\3\2\2"+
		"\2\65\u0135\3\2\2\2\67\u0139\3\2\2\29\u013d\3\2\2\2;\u0141\3\2\2\2=\u0146"+
		"\3\2\2\2?\u0149\3\2\2\2A\u014c\3\2\2\2C\u014f\3\2\2\2E\u0153\3\2\2\2G"+
		"\u0156\3\2\2\2I\u0159\3\2\2\2K\u015c\3\2\2\2M\u015f\3\2\2\2O\u0162\3\2"+
		"\2\2Q\u0165\3\2\2\2S\u0168\3\2\2\2U\u016b\3\2\2\2W\u016e\3\2\2\2Y\u0171"+
		"\3\2\2\2[\u0174\3\2\2\2]\u0177\3\2\2\2_\u017a\3\2\2\2a\u017c\3\2\2\2c"+
		"\u017e\3\2\2\2e\u0180\3\2\2\2g\u0182\3\2\2\2i\u0184\3\2\2\2k\u0186\3\2"+
		"\2\2m\u0188\3\2\2\2o\u018a\3\2\2\2q\u018c\3\2\2\2s\u018e\3\2\2\2u\u0190"+
		"\3\2\2\2w\u0192\3\2\2\2y\u0194\3\2\2\2{\u0196\3\2\2\2}\u0198\3\2\2\2\177"+
		"\u019a\3\2\2\2\u0081\u019c\3\2\2\2\u0083\u019e\3\2\2\2\u0085\u01a0\3\2"+
		"\2\2\u0087\u01a2\3\2\2\2\u0089\u01a5\3\2\2\2\u008b\u01a7\3\2\2\2\u008d"+
		"\u01aa\3\2\2\2\u008f\u01ac\3\2\2\2\u0091\u01ae\3\2\2\2\u0093\u01b0\3\2"+
		"\2\2\u0095\u01b4\3\2\2\2\u0097\u01bf\3\2\2\2\u0099\u01da\3\2\2\2\u009b"+
		"\u01dc\3\2\2\2\u009d\u01e5\3\2\2\2\u009f\u01e9\3\2\2\2\u00a1\u01f2\3\2"+
		"\2\2\u00a3\u01f8\3\2\2\2\u00a5\u0201\3\2\2\2\u00a7\u020d\3\2\2\2\u00a9"+
		"\u020f\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2"+
		"\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7p\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7d\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7m\2\2\u00b8\6\3\2\2\2\u00b9\u00ba"+
		"\7d\2\2\u00ba\u00bb\7{\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\b\3\2\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7u\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\n\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7t\2\2\u00c7\f\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7v\2\2"+
		"\u00cd\16\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7"+
		"p\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7w\2\2\u00d5\u00d6\7g\2\2\u00d6\20\3\2\2\2\u00d7\u00d8\7f\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\22\3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd"+
		"\7w\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0"+
		"\24\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4"+
		"\u00e5\7g\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7v\2\2\u00eb\30\3\2\2\2\u00ec"+
		"\u00ed\7h\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7t\2\2\u00ef\32\3\2\2\2\u00f0"+
		"\u00f1\7k\2\2\u00f1\u00f2\7h\2\2\u00f2\34\3\2\2\2\u00f3\u00f4\7n\2\2\u00f4"+
		"\u00f5\7q\2\2\u00f5\u00f6\7p\2\2\u00f6\u00f7\7i\2\2\u00f7\36\3\2\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7w\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\u00fe\7p\2\2\u00fe \3\2\2\2\u00ff\u0100\7u\2"+
		"\2\u0100\u0101\7j\2\2\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103\u0104"+
		"\7v\2\2\u0104\"\3\2\2\2\u0105\u0106\7u\2\2\u0106\u0107\7y\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7v\2\2\u0109\u010a\7e\2\2\u010a\u010b\7j\2\2\u010b"+
		"$\3\2\2\2\u010c\u010d\7x\2\2\u010d\u010e\7q\2\2\u010e\u010f\7k\2\2\u010f"+
		"\u0110\7f\2\2\u0110&\3\2\2\2\u0111\u0112\7y\2\2\u0112\u0113\7j\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7n\2\2\u0115\u0116\7g\2\2\u0116(\3\2\2\2\u0117"+
		"\u0118\7v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7w\2\2\u011a\u011b\7g\2\2"+
		"\u011b*\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2\u011e\u011f\7n\2"+
		"\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2\u0121,\3\2\2\2\u0122\u0123\7"+
		"p\2\2\u0123\u0124\7w\2\2\u0124\u0125\7n\2\2\u0125\u0126\7n\2\2\u0126."+
		"\3\2\2\2\u0127\u0128\7U\2\2\u0128\u0129\7v\2\2\u0129\u012a\7t\2\2\u012a"+
		"\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7i\2\2\u012d\60\3\2\2\2\u012e"+
		"\u012f\7k\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\62\3\2\2\2\u0132"+
		"\u0133\7\61\2\2\u0133\u0134\7\61\2\2\u0134\64\3\2\2\2\u0135\u0136\7@\2"+
		"\2\u0136\u0137\7@\2\2\u0137\u0138\7@\2\2\u0138\66\3\2\2\2\u0139\u013a"+
		"\7>\2\2\u013a\u013b\7>\2\2\u013b\u013c\7?\2\2\u013c8\3\2\2\2\u013d\u013e"+
		"\7@\2\2\u013e\u013f\7@\2\2\u013f\u0140\7?\2\2\u0140:\3\2\2\2\u0141\u0142"+
		"\7@\2\2\u0142\u0143\7@\2\2\u0143\u0144\7@\2\2\u0144\u0145\7?\2\2\u0145"+
		"<\3\2\2\2\u0146\u0147\7(\2\2\u0147\u0148\7?\2\2\u0148>\3\2\2\2\u0149\u014a"+
		"\7`\2\2\u014a\u014b\7?\2\2\u014b@\3\2\2\2\u014c\u014d\7~\2\2\u014d\u014e"+
		"\7?\2\2\u014eB\3\2\2\2\u014f\u0150\7(\2\2\u0150\u0151\7(\2\2\u0151\u0152"+
		"\7?\2\2\u0152D\3\2\2\2\u0153\u0154\7(\2\2\u0154\u0155\7(\2\2\u0155F\3"+
		"\2\2\2\u0156\u0157\7~\2\2\u0157\u0158\7~\2\2\u0158H\3\2\2\2\u0159\u015a"+
		"\7-\2\2\u015a\u015b\7-\2\2\u015bJ\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e"+
		"\7/\2\2\u015eL\3\2\2\2\u015f\u0160\7-\2\2\u0160\u0161\7?\2\2\u0161N\3"+
		"\2\2\2\u0162\u0163\7/\2\2\u0163\u0164\7?\2\2\u0164P\3\2\2\2\u0165\u0166"+
		"\7?\2\2\u0166\u0167\7?\2\2\u0167R\3\2\2\2\u0168\u0169\7#\2\2\u0169\u016a"+
		"\7?\2\2\u016aT\3\2\2\2\u016b\u016c\7>\2\2\u016c\u016d\7>\2\2\u016dV\3"+
		"\2\2\2\u016e\u016f\7@\2\2\u016f\u0170\7@\2\2\u0170X\3\2\2\2\u0171\u0172"+
		"\7,\2\2\u0172\u0173\7?\2\2\u0173Z\3\2\2\2\u0174\u0175\7\61\2\2\u0175\u0176"+
		"\7?\2\2\u0176\\\3\2\2\2\u0177\u0178\7\'\2\2\u0178\u0179\7?\2\2\u0179^"+
		"\3\2\2\2\u017a\u017b\7*\2\2\u017b`\3\2\2\2\u017c\u017d\7+\2\2\u017db\3"+
		"\2\2\2\u017e\u017f\7}\2\2\u017fd\3\2\2\2\u0180\u0181\7\177\2\2\u0181f"+
		"\3\2\2\2\u0182\u0183\7=\2\2\u0183h\3\2\2\2\u0184\u0185\7<\2\2\u0185j\3"+
		"\2\2\2\u0186\u0187\7.\2\2\u0187l\3\2\2\2\u0188\u0189\7\60\2\2\u0189n\3"+
		"\2\2\2\u018a\u018b\7A\2\2\u018bp\3\2\2\2\u018c\u018d\7-\2\2\u018dr\3\2"+
		"\2\2\u018e\u018f\7/\2\2\u018ft\3\2\2\2\u0190\u0191\7,\2\2\u0191v\3\2\2"+
		"\2\u0192\u0193\7\61\2\2\u0193x\3\2\2\2\u0194\u0195\7(\2\2\u0195z\3\2\2"+
		"\2\u0196\u0197\7~\2\2\u0197|\3\2\2\2\u0198\u0199\7\'\2\2\u0199~\3\2\2"+
		"\2\u019a\u019b\7#\2\2\u019b\u0080\3\2\2\2\u019c\u019d\7^\2\2\u019d\u0082"+
		"\3\2\2\2\u019e\u019f\7?\2\2\u019f\u0084\3\2\2\2\u01a0\u01a1\7@\2\2\u01a1"+
		"\u0086\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3\u01a4\7?\2\2\u01a4\u0088\3\2\2"+
		"\2\u01a5\u01a6\7>\2\2\u01a6\u008a\3\2\2\2\u01a7\u01a8\7>\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9\u008c\3\2\2\2\u01aa\u01ab\7]\2\2\u01ab\u008e\3\2\2\2\u01ac"+
		"\u01ad\7_\2\2\u01ad\u0090\3\2\2\2\u01ae\u01af\7\u0080\2\2\u01af\u0092"+
		"\3\2\2\2\u01b0\u01b1\7`\2\2\u01b1\u0094\3\2\2\2\u01b2\u01b5\5\u00a9U\2"+
		"\u01b3\u01b5\t\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01bb"+
		"\3\2\2\2\u01b6\u01ba\5\u00a9U\2\u01b7\u01ba\t\2\2\2\u01b8\u01ba\5\u00a7"+
		"T\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba"+
		"\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u0096\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\5\u00a7T\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u0098\3\2"+
		"\2\2\u01c3\u01c5\5\u00a7T\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\7\60"+
		"\2\2\u01c9\u01cb\5\u00a7T\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\7h"+
		"\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01db\3\2\2\2\u01d1"+
		"\u01d3\7\60\2\2\u01d2\u01d4\5\u00a7T\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7"+
		"\u01d9\7h\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01c4\3\2\2\2\u01da\u01d1\3\2\2\2\u01db\u009a\3\2\2\2\u01dc"+
		"\u01e0\7$\2\2\u01dd\u01df\13\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\7$\2\2\u01e4\u009c\3\2\2\2\u01e5\u01e6\7)\2"+
		"\2\u01e6\u01e7\13\2\2\2\u01e7\u01e8\7)\2\2\u01e8\u009e\3\2\2\2\u01e9\u01ea"+
		"\t\3\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\bP\2\2\u01ec\u00a0\3\2\2\2\u01ed"+
		"\u01ef\7\17\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3"+
		"\2\2\2\u01f0\u01f3\7\f\2\2\u01f1\u01f3\7\17\2\2\u01f2\u01ee\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\bQ\2\2\u01f7\u00a2\3\2\2\2\u01f8"+
		"\u01f9\7\61\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fe\3\2\2\2\u01fb\u01fd\n"+
		"\4\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u00a4\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7\61"+
		"\2\2\u0202\u0203\7,\2\2\u0203\u0207\3\2\2\2\u0204\u0206\13\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0208\3\2\2\2\u0207\u0205\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7,\2\2\u020b"+
		"\u020c\7\61\2\2\u020c\u00a6\3\2\2\2\u020d\u020e\t\5\2\2\u020e\u00a8\3"+
		"\2\2\2\u020f\u0210\t\6\2\2\u0210\u00aa\3\2\2\2\23\2\u01b4\u01b9\u01bb"+
		"\u01c1\u01c6\u01cc\u01cf\u01d5\u01d8\u01da\u01e0\u01ee\u01f2\u01f4\u01fe"+
		"\u0207\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}