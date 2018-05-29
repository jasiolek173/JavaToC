package com.compailer.javatoc.frontend;

import com.compailer.javatoc.parser.JavaToCLexer;
import com.compailer.javatoc.parser.JavaToCParser;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Translator {

    @FXML
    TextArea inputArea;
    @FXML
    TextArea outputArea;
    @FXML
    Button translatebtn;

    public void translate(){
        JavaToCLexer javaToCLexer = new JavaToCLexer(CharStreams.fromString(inputArea.getText()));
        JavaToCParser javaToCParser = new JavaToCParser(new CommonTokenStream(javaToCLexer));
        outputArea.setText(javaToCParser.compilationUnit().getText());
    }

}
