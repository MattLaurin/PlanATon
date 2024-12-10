package com.planaton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class main extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Plan-A-Ton");

        Button btn = new Button("Welcome to Plan-A-Ton");
        btn.setOnAction(event -> System.out.println("Button clicked!"));
    

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}