parser grammar JavaToCParser;

@header{
package com.compailer.javatoc.parser;
    }
options { tokenVocab=JavaToCLexer; }

compilationUnit:
                    INTEGER_NUMBER;


variableDeclaration:
                     type ID;

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
      TRUE
    | FALSE
    ;

logicalEquivalent:
      logicalConst
    | ID
    ;

arithmeticExpression:
       arithmeticExpression MULTIPLICATION_SYM arithmeticExpression
     | arithmeticExpression DIVISION_SYM arithmeticExpression
     | arithmeticExpression PLUS_SYM arithmeticExpression
     | arithmeticExpression MINUS_SYM arithmeticExpression
     | MINUS_SYM arithmeticExpression
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