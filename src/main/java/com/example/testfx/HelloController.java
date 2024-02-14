package com.example.testfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Circle mycircle ;
    private double x ;
    private double y;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void testButton(ActionEvent act){
        welcomeText.setText("Hello mohamed welcome to my first test");
    }
    @FXML
    void onTest2(MouseEvent event) {
        welcomeText.setText("hello again !!!");
    }
    @FXML
    public void up(ActionEvent e){
        System.out.println("up souka");
        mycircle.setCenterY(y=y-1 );
    }

    public void displayName(String username){
        welcomeText.setText("Hello" + username);
    }

}