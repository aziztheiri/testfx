package com.example.testfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class BackOfficeProduitMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BackOffice_produitfini.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("LOGO.png");
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
}
