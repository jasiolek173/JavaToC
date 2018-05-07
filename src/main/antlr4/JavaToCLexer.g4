lexer grammar JavaToCLexer;

@header{
package com.compailer.javatoc.parser;
    }

BOOLEAN_SYM: 						'boolean';
BREAK_SYM: 							'break';
BYTE_SYM: 							'byte';
CASE_SYM:							'case';
CHAR_SYM:							'char';
CONST_SYM:							'const';
CONTINUE_SYM:						'continue';
DO_SYM:								'do';
DOUBLE_SYM:							'double';
ELSE_SYM:							'else';
FLOAT_SYM:							'float';
FOR_SYM:							'for';
IF_SYM:								'if';
LONG_SYM:							'long';
RETURN_SYM:							'return';
SHORT_SYM:							'short';
SWITCH_SYM:							'switch';
VOID_SYM:							'void';
WHILE_SYM:							'while';
TRUE_SYM:							'true';
FALSE_SYM:							'false';
NULL_SYM:							'null';
STRING_SYM:							'String';
INTEGER_SYM:						'int';
COMM_SYM:    						'//';
UN_RIGHT_BIT_SHIFT_SYM:				'>>>';
ASSIGN_LEFT_BIT_SHIFT_SYM:			'<<=';
ASSIGN_RIGHT_BIT_SHIFT_SYM:			'>>=';
ASSIGN_UN_RIGHT_BIT_SHIFT_SYM:		'>>>=';
ASSIGN_BITWISE_AND_SYM:				'&=';
ASSIGN_BITWISE_EX_OR_SYM:			'^=';
ASSIGN_BITWISE_IN_OR_SYM:			'|=';
ASSIGN_LOGICAL_AND_SYM:				'&&=';
LOGICAL_AND_SYM:					'&&';
LOGICAL_OR_SYM:						'||';
INCREMENT_SYM:						'++';
DECREMENT_SYM:						'--';
ASSIGN_PLUS_SYM:					'+=';
ASSIGN_MINUS_SYM:					'-=';
EQUALS_SYM:							'==';
NOT_EQUALS_SYM:						'!=';
LEFT_BIT_SHIFT_SYM:					'<<';
RIGHT_BIT_SHIFT_SYM:				'>>';
ASSIGN_MULTIPLICATION_SYM:			'*=';
ASSIGN_DIVISION_SYM:				'/=';
ASSIGN_MODULO_SYM:                  '%=';
LEFT_PARENTHESE_SYM:				'(';
RIGHT_PARENTHESE_SYM:				')';
LEFT_BRACE_SYM:						'{';
RIGHT_BRACE_SYM:					'}';
SEMICOLON_SYM:						';';
COLON_SYM:							':';
COMMA_SYM:							',';
DOT_SYM:							'.';
QUESTION_MARK_SYM:					'?';
PLUS_SYM:							'+';
MINUS_SYM:							'-';
MULTIPLICATION_SYM:					'*';
DIVISION_SYM:						'/';
BITWISE_AND_SYM:					'&';
BITWISE_IN_OR_SYM:					'|';
MODULO_SYM:							'%';
NEGATIVE_SYM:						'!';
TWO_BACKSLASHES_SYM:				'\\';
ASSIGNMENT_SYM:						'=';
GREATER_SYM:						'>';
GREATER_OR_EQUAL_SYM:               '>=';
LESS_SYM:							'<';
LESS_OR_EQUAL_SYM:                  '<=';
LEFT_BRACKET_SYM:					'[';
RIGHT_BRACKET_SYM:					']';
TILDE_SYM:							'~';
BITWISE_EX_OR_SYM:					'^';


ID:
    ( LETTER | '$' | '_' ) ( LETTER | '$' | '_' | DIGIT )*
    ;


INTEGER_NUMBER:
                DIGIT+
                ;
FLOAT_NUMBER:
             DIGIT+ '.' DIGIT+ 'f'?
             |  '.' DIGIT+ 'f'?
             ;

STRING:
            '"' .*? '"'
            ;
CHAR:
            '\'' . '\''
            ;

WHITE_SPACES:
            [ \t\r\n] -> skip ;

NEW_LINE:
        ('\r'? '\n' | '\r')+
        ;

LINE_COMMENT:
            '//' ~[NEW_LINE]*
            ;
COMMENT:
        '/*' .*? '*/'
        ;

fragment DIGIT:
                [0-9]
                ;
fragment LETTER:
                [a-zA-Z]
                ;
