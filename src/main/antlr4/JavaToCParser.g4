parser grammar JavaToCParser;

@header{
package com.compailer.javatoc.parser;
    }
options { tokenVocab=JavaToCLexer; }

compilationUnit:
                    INTEGER_NUMBER;


variableDeclaration:
                     type ID
                     ;

statement:
          variableDeclaration SEMICOLON_SYM
        | ifStatement
        | whileDoStatement
        | doWhileStatement
        | forStatement
        | enhancedForStatement
        | returnStatement
        ;


comparisonOperator:
      GREATER_SYM
    | LESS_SYM
    | GREATER_OR_EQUAL_SYM
    | LESS_OR_EQUAL_SYM
    | EQUALS_SYM
    ;

number:
      INTEGER_NUMBER
    | FLOAT_NUMBER
    ;

numberEquivalent:
      number
    | ID
    ;

logicalConst:
      TRUE_SYM
    | FALSE_SYM
    ;

logicalEquivalent:
      logicalConst
    | ID
    ;

arithmeticExpression:
       MINUS_SYM arithmeticExpression
     | arithmeticExpression MULTIPLICATION_SYM arithmeticExpression
     | arithmeticExpression DIVISION_SYM arithmeticExpression
     | arithmeticExpression PLUS_SYM arithmeticExpression
     | arithmeticExpression MINUS_SYM arithmeticExpression
     | LEFT_PARENTHESE_SYM arithmeticExpression RIGHT_PARENTHESE_SYM
     | numberEquivalent
     ;

comparisonExpression:
       arithmeticExpression comparisonOperator arithmeticExpression
     | LEFT_PARENTHESE_SYM comparisonExpression RIGHT_PARENTHESE_SYM
     ;

logicalExpression:
       logicalExpression LOGICAL_AND_SYM logicalExpression
     | logicalExpression LOGICAL_OR_SYM logicalExpression
     | comparisonExpression
     | LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM
     | logicalEquivalent
     ;

type:
        BOOLEAN_SYM
      | BYTE_SYM
      | CHAR_SYM
      | INTEGER_SYM
      | SHORT_SYM
      | LONG_SYM
      | FLOAT_SYM
      | DOUBLE_SYM
      ;

block:
      LEFT_BRACE_SYM statement* RIGHT_BRACE_SYM
      ;

ifStatement:
    IF_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (block | statement)
    ( ELSE_SYM IF_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (block | statement))*
    (ELSE_SYM (block | statement))?
    ;

doWhileStatement:
    DO_SYM (block | statement | continueStatement | breakStatement) WHILE_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM
    ;

whileDoStatement:
    WHILE_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (block | statement | continueStatement | breakStatement)
    ;

assignmentOperator:
        ASSIGNMENT_SYM
	  | ASSIGN_MULTIPLICATION_SYM
	  | ASSIGN_DIVISION_SYM
	  | ASSIGN_MODULO_SYM
	  | ASSIGN_PLUS_SYM
	  | ASSIGN_MINUS_SYM
	  | ASSIGN_LEFT_BIT_SHIFT_SYM
	  | ASSIGN_RIGHT_BIT_SHIFT_SYM
	  | ASSIGN_UN_RIGHT_BIT_SHIFT_SYM
	  | ASSIGN_BITWISE_AND_SYM
	  | ASSIGN_BITWISE_EX_OR_SYM
	  | ASSIGN_BITWISE_IN_OR_SYM
	  ;

expression:
        arithmeticExpression
      | logicalExpression
      | assignmentExpression
      ;

assignment:
        assignmentExpression
        SEMICOLON_SYM
        ;


assignmentExpression:
        ID assignmentOperator (ID | expression)
        ;

forStatement:
        enhancedForStatement
      | FOR_SYM LEFT_PARENTHESE_SYM forInit? SEMICOLON_SYM logicalExpression? SEMICOLON_SYM forUpdate? RIGHT_PARENTHESE_SYM
        (block | continueStatement | breakStatement | statement)
      ;

forInit:
        variableDeclaration (ASSIGNMENT_SYM ID)+ (ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING))?
      | ID (ASSIGNMENT_SYM ID)+ (ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING | ID))?
      | variableDeclaration ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING | ID)
      ;

forUpdate:
        assignmentExpression+ (COMMA_SYM assignmentExpression)*
      ;

enhancedForStatement:
        FOR_SYM LEFT_PARENTHESE_SYM type ID COLON_SYM ID RIGHT_PARENTHESE_SYM (block | statement)
      ;

returnStatement:
        RETURN_SYM expression? SEMICOLON_SYM
      ;

breakStatement:
        BREAK_SYM ID? SEMICOLON_SYM
      ;

continueStatement:
      CONTINUE_SYM ID? SEMICOLON_SYM
    ;
