package ru.sapteh.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;

public class MainController {

    @FXML
    private TextField txtLogin;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button buttonToWin3;
    @FXML
    private ImageView mainImage;

    @FXML
    private Button buttonExit;

    @FXML
    private Button buttonOpenProgram;

    @FXML
    public void onActionOpenProgram(ActionEvent event){

    }
    @FXML
    public void onActionExit(ActionEvent event){

    }
    @FXML
    public  void  onActionRegistr(ActionEvent event){

    }


    @FXML
    public void initialize(){

        getMainImage();

        buttonExit.setOnAction(event -> {
            buttonExit.getScene().getWindow().hide();
        });

        buttonOpenProgram.setOnAction(event -> {
            buttonOpenProgram.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/view/client.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Autoservice_Client");
            assert root != null;
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/auto.png")));
            stage.showAndWait();

        } );
        buttonToWin3.setOnAction(event -> {
            buttonToWin3.getScene().getWindow().hide();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/view/Registration.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Registr");
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/Reg.png")));
            stage.showAndWait();



    });
    }


    private void getMainImage(){
        try {
            InputStream pathImage = new FileInputStream("./src/main/resources/images/service_logo.png");
            Image image = new Image(pathImage);
            mainImage.setImage(image);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
