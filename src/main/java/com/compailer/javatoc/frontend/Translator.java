package com.compailer.javatoc.frontend;

import com.compailer.javatoc.parser.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Translator {

    @FXML
    TextArea inputArea;
    @FXML
    TextArea outputArea;
    @FXML
    Button translatebtn;

    public void translate() {
        MyListener listener = new MyListener();

        JavaToCLexer javaToCLexer = new JavaToCLexer(CharStreams.fromString(inputArea.getText()));
        javaToCLexer.removeErrorListeners();
        javaToCLexer.addErrorListener(listener);

        JavaToCParser javaToCParser = new JavaToCParser(new CommonTokenStream(javaToCLexer));
        javaToCParser.removeErrorListeners();
        javaToCParser.addErrorListener(listener);

        JavaToCParser.CompilationUnitContext compilationUnitContext = javaToCParser.compilationUnit();
        System.out.println(javaToCParser.getNumberOfSyntaxErrors());
        if (javaToCParser.getNumberOfSyntaxErrors() == 0) {
            //LISTENER
       /* ParseTreeWalker walker=new ParseTreeWalker();

        walker.walk(listener,compilationUnitContext);

        outputArea.setText(listener.getText());*/
        //VISITOR
            MyVisitor visitor=new MyVisitor();
            outputArea.setText(visitor.visit(compilationUnitContext));

        } else {
            outputArea.setText(listener.getText());
        }

    }

}
