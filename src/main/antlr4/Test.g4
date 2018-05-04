
grammar Test;

@header{
package com.compailer.javatoc.parser;
    }

main: 'Hello ' name '!';
name: ANY+;
ANY: .;