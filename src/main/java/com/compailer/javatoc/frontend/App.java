package com.compailer.javatoc.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private static final String TRANSLATOR_PANE = "/Translator.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(TRANSLATOR_PANE));
        primaryStage.setTitle("JavaToC");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
