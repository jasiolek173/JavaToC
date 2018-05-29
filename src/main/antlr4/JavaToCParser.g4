parser grammar JavaToCParser;

@header{
package com.compailer.javatoc.parser;
    }
options { tokenVocab=JavaToCLexer; }

compilationUnit:
                function*;

variableDeclaration:
                     type ID
                     {
                        if($block::symbols.contains($ID.text)) {
                            System.err.println("Variable " + "\"" + $ID.text + "\"" + " already declared in this scope.");
                        } else {
                            $block::symbols.add($ID.text);
                        }
                     }
                     SEMICOLON_SYM
                     ;

statement:
          variableDeclaration
        | arrayVariableDeclaration
        | arrayVariableDeclarationWithInitialization
        | ifStatement
        | whileDoStatement
        | doWhileStatement
        | forStatement
        | enhancedForStatement
        | returnStatement
        | assignment
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
    | arrayElement
    ;

logicalConst:
      TRUE_SYM
    | FALSE_SYM
    ;

logicalEquivalent:
      logicalConst
    | ID
    | arrayElement
    ;

arithmeticExpression:
       MINUS_SYM arithmeticExpression
     | arithmeticExpression MULTIPLICATION_SYM arithmeticExpression
     | arithmeticExpression DIVISION_SYM arithmeticExpression
     | arithmeticExpression PLUS_SYM arithmeticExpression
     | arithmeticExpression MINUS_SYM arithmeticExpression
     | arithmeticExpression MODULO_SYM arithmeticExpression
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

block
      locals [
      List<String> symbols = new ArrayList<String>();
      ]
      :
      LEFT_BRACE_SYM statement* RIGHT_BRACE_SYM
      ;

loopBlock
      locals [
      List<String> symbols = new ArrayList<String>();
      ]
      :
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
      | preIncrementationExpression
      | postIncrementationExpression
      | preDecrementationExpression
      | postDecrementationExpression
      ;

assignment:
        assignmentExpression
        SEMICOLON_SYM
      ;


assignmentExpression:
        ((ID | arrayElement) assignmentOperator (ID | arrayElement | expression)
      | (ID | arrayElement) (ASSIGNMENT_SYM (ID | arrayElement))+ expression?)
      { if(!$block::symbols.contains($ID.text) &&
      ($arrayElement.text == null || !$block::symbols.contains($arrayElement.text.split("\\[")[0]))) {
        if($ID.text != null) {
            System.err.println("Undefined variable: " + "\"" + $ID.text + "\"");
        }
        else {
            System.err.println("Undefined variable: " + "\"" + $arrayElement.text.split("\\[")[0] + "\"");
        }
      }
      }
      ;

forStatement:
        enhancedForStatement
      | FOR_SYM LEFT_PARENTHESE_SYM forInit? SEMICOLON_SYM logicalExpression? SEMICOLON_SYM forUpdate? RIGHT_PARENTHESE_SYM
        (loopBlock | loopStatment)
      ;

forInit:
        variableDeclaration (ASSIGNMENT_SYM (ID | arrayElement))+ (ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING))?
      | (ID | arrayElement) (ASSIGNMENT_SYM (ID | arrayElement))+ (ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING | ID | arrayElement))?
      | variableDeclaration ASSIGNMENT_SYM (numberEquivalent | CHAR | STRING | ID | arrayElement)
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

function
        locals [
        List<String> parameters = new ArrayList<String>(),
        String functionName = new String();
        ]
        :
        (type (LEFT_BRACKET_SYM RIGHT_BRACKET_SYM)? | VOID_SYM) ID
        {$functionName = $ID.text;}
        LEFT_PARENTHESE_SYM parameterList RIGHT_PARENTHESE_SYM block
        ;

parameterList:
        (type ID
        {
        $function::parameters.add($ID.text);
        }
        (LEFT_BRACKET_SYM RIGHT_BRACKET_SYM)? (COMMA_SYM type ID
        {
        if($function::parameters.contains($ID.text))
        { System.err.println("\"" + $ID.text + "\"" + " argument already declared in function " + "\""
        +  $function::functionName + "\"" + "."); }
        $function::parameters.add($ID.text);
        }
        (LEFT_BRACKET_SYM RIGHT_BRACKET_SYM)?)*)?
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
        (ID | arrayElement | INTEGER_NUMBER) (bitOperator (ID | arrayElement | INTEGER_NUMBER))+
      ;

stringNullAssignment:
        STRING_SYM ID ASSIGNMENT_SYM NULL_SYM;

preIncrementationExpression:
        INCREMENT_SYM (ID | arrayElement)
      ;

postIncrementationExpression:
        (ID | arrayElement) INCREMENT_SYM
      ;

preDecrementationExpression:
        DECREMENT_SYM (ID | arrayElement)
      ;

postDecrementationExpression:
        (ID | arrayElement) DECREMENT_SYM
      ;

arrayVariableDeclaration:
        type ID LEFT_BRACKET_SYM
        (
        INTEGER_NUMBER
      | ID
      | arithmeticExpression
      | assignmentExpression
      | preDecrementationExpression
      | preIncrementationExpression
      | postDecrementationExpression
      | postIncrementationExpression
        )
        RIGHT_BRACKET_SYM
        {
            if($block::symbols.contains($ID.text)) {
                System.err.println("Variable " + "\"" + $ID.text + "\"" + " already declared in this scope.");
            } else {
                $block::symbols.add($ID.text);
            }
        }
        SEMICOLON_SYM
        ;

arrayVariableDeclarationWithInitialization:
        type ID LEFT_BRACKET_SYM RIGHT_BRACKET_SYM ASSIGNMENT_SYM LEFT_BRACE_SYM
        ((expression COMMA_SYM)*expression? | COMMA_SYM? | expression)
        RIGHT_BRACE_SYM
        {
            if($block::symbols.contains($ID.text)) {
                System.err.println("Variable " + "\"" + $ID.text + "\"" + " already declared in this scope.");
            } else {
                $block::symbols.add($ID.text);
            }
        }
        SEMICOLON_SYM
        ;

arrayElement:
        ID LEFT_BRACKET_SYM expression RIGHT_BRACKET_SYM
        ;