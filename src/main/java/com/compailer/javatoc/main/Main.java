package com.compailer.javatoc.main;

import com.compailer.javatoc.parser.TestLexer;
import com.compailer.javatoc.parser.TestParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        TestLexer lexer = new TestLexer(CharStreams.fromString("Hallo John!"));
        TestParser parser = new TestParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();
        System.out.println(name);
    }
}
