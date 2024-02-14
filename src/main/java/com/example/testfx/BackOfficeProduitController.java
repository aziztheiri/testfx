package com.example.testfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class BackOfficeProduitController implements Initializable {
    @FXML
    private ImageView imgView;
    @FXML
    private Button btnfile ;
    @FXML
    private Circle CircleProfile;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image profileimage = new Image("profile.png");
        CircleProfile.setFill(new ImagePattern(profileimage));
    }
    @FXML
    public void fileButtonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open a file");
        fileChooser.setInitialDirectory(new File("C:\\"));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("JPEG image", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG image", "*.png")
        );
        File selectedFile = fileChooser.showOpenDialog(btnfile.getScene().getWindow());
        if (selectedFile != null) {
            imgView.setImage(new Image(selectedFile.toURI().toString()));
            String imageUrl = selectedFile.toURI().toString();
            // Send the imageUrl to your database using your database logic
            System.out.println("Image URL: " + imageUrl);
        } else {
            System.out.println("No file has been selected");
        }
    }

    @FXML
    public void testAction(ActionEvent e){
        System.out.println("button works souka");
    }
}
