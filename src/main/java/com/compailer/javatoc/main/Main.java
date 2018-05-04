package com.compailer.javatoc.main;

import com.compailer.javatoc.parser.JavaToCLexer;
import com.compailer.javatoc.parser.JavaToCParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        JavaToCLexer javaToCLexer = new JavaToCLexer(CharStreams.fromString("1"));
        JavaToCParser javaToCParser = new JavaToCParser(new CommonTokenStream(javaToCLexer));
        System.out.println(javaToCParser.compilationUnit().getText());
    }
}
