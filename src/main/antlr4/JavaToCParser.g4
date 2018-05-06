parser grammar JavaToCParser;

@header{
package com.compailer.javatoc.parser;
    }
options { tokenVocab=JavaToCLexer; }

compilationUnit  :
                    INTEGER_NUMBER;


variableDeclaration:
                     types ID;






types:
        BOOLEAN_SYM
      | BYTE_SYM
      | CHAR_SYM
      | INTEGER_SYM
      | SHORT_SYM
      | LONG_SYM
      | FLOAT_SYM
      | DOUBLE_SYM
      ;