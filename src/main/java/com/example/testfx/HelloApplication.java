package com.example.testfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("test.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event->logout(stage));
    }
    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("you're about to logout");
        alert.setContentText("Do you want to save before exit ?");
        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("nice logout brudah");
            stage.close();
        }
    }


    public static void main(String[] args) {
        launch();
    }
}