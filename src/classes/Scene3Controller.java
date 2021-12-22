package com.example.demo;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene3Controller implements Initializable{

    @FXML
    private Button Play;

    @FXML
    private RadioButton btn1;

    @FXML
    private RadioButton btn2;

    @FXML
    private Button exit3;

    @FXML
    private ToggleGroup grp;

    @FXML
    private TextArea tf1;

    @FXML
    private TextArea tf2;

    @FXML
    private TextArea tf3;

    @FXML
    private TextArea tf4;

    @FXML
    void Exit(ActionEvent event) throws IOException {
     if (event.getSource() == exit3) {
            Game.exit4();
        }
    }

    @FXML
    void play(ActionEvent event) throws IOException {
//        String p1name = "player1", p2name = "player2";
        System.out.println("Hello!");



        if (btn1.isSelected()) {
            Image im1 = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\images\\bluePawn.png"));
            Image im2 = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\images\\greenPawn.png"));

            if (tf1.getText().trim().isEmpty() || tf2.getText().trim().isEmpty()) {


                GamePlay.launchGame(im1,im2,"Player1","Player2");
            } else {
                System.out.println("Hello from el");
                System.out.println(tf1.getText()+" "+tf2.getText());



//                controller.setValues(tf1.getText(),tf2.getText());
                GamePlay.launchGame(im1,im2,tf1.getText(),tf2.getText());




            }
        } else if (btn2.isSelected()) {
            Image im1 = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\images\\redPawn.png"));
            Image im2 = new Image(new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\images\\yellowPawn.png"));
            if (tf3.getText().trim().isEmpty() || tf4.getText().trim().isEmpty()) {
                GamePlay.launchGame(im1,im2,"Player1","Player2");
            } else {

                GamePlay.launchGame(im1,im2,tf3.getText(),tf4.getText());
//                GamePlay.launchGame(tf3,tf4,dicebtn,pawnImagered,pawnImageyellow);
            }
        }



    }

    @FXML
    public void radio(ActionEvent actionEvent) throws IOException {
        if (btn1.isSelected()) {
            try {
                tf3.setDisable(true);
                tf4.setDisable(true);
                tf2.setDisable(false);
                tf1.setDisable(false);
                HelloController.p1name = tf1.getText();
                HelloController.p2name = tf2.getText();

            } catch (Exception e) {
            }
        } else if (btn2.isSelected()) {
            try {
                tf2.setDisable(true);
                tf1.setDisable(true);
                tf3.setDisable(false);
                tf4.setDisable(false);
                HelloController.p1name = tf3.getText();
                HelloController.p2name = tf4.getText();


            } catch (Exception e) {
            }
        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
