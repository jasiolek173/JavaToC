parser grammar JavaToCParser;

@header{
package com.compailer.javatoc.parser;
    }
options { tokenVocab=JavaToCLexer; }

compilationUnit:
                function*;


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

loopStatment:
                statement
             |  breakStatement
             |  continueStatement
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
     | logicalExpression BITWISE_AND_SYM logicalExpression
     | logicalExpression BITWISE_IN_OR_SYM logicalExpression
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
loopBlock:
      LEFT_BRACE_SYM loopStatment* RIGHT_BRACE_SYM
      ;


ifStatement:
    IF_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (block | statement)
    ( ELSE_SYM IF_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (block | statement))*
    (ELSE_SYM (block | statement))?
    ;

doWhileStatement:
    DO_SYM (loopBlock | loopStatment) WHILE_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM
    ;

whileDoStatement:
    WHILE_SYM LEFT_PARENTHESE_SYM logicalExpression RIGHT_PARENTHESE_SYM (loopBlock | loopStatment)
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
      | ID (ASSIGNMENT_SYM ID)+ expression?
      ;

forStatement:
        enhancedForStatement
      | FOR_SYM LEFT_PARENTHESE_SYM forInit? SEMICOLON_SYM logicalExpression? SEMICOLON_SYM forUpdate? RIGHT_PARENTHESE_SYM
        (loopBlock | loopStatment)
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

function:
        (type|VOID_SYM) ID LEFT_PARENTHESE_SYM parameterList RIGHT_PARENTHESE_SYM block
        ;

parameterList:
        (type ID (COMMA_SYM type ID)*)?
        ;

bitOperator:
        UN_RIGHT_BIT_SHIFT_SYM
      | LEFT_BIT_SHIFT_SYM
      | RIGHT_BIT_SHIFT_SYM
      | BITWISE_AND_SYM
      | BITWISE_IN_OR_SYM
      | BITWISE_EX_OR_SYM
      ;

bitExpression:
        (ID | INTEGER_NUMBER) (bitOperator (ID | INTEGER_NUMBER))+
      ;
