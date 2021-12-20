package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button startGame;
    @FXML
    private Button exit2;

    @FXML
    private Button settings;


//    @FXML
//    static RadioButton btn1;
//    @FXML
//    static RadioButton btn2;

    @FXML
    private ToggleGroup tgrp;

    @FXML
    private Button dicebtn;

    @FXML
    private ImageView player1;

    @FXML
    private ImageView player2;

    @FXML
    static TextArea tf1;

    @FXML
    static  TextArea tf3;

    @FXML
    static TextArea tf2;

    @FXML
    static TextArea tf4;
    @FXML
    private Button exit5;

//    @FXML
//    private Text text1;
//
//    @FXML
//    private Text text2;

    @FXML
    private Button Play;

    @FXML
    private Button exit4;

    @FXML
    private Button Okay;

    @FXML
    private Button resume;  // Scene6

    @FXML
    private Button Menu;

    @FXML
    private Button Replay;


    @FXML
    private Image pawnImagered;
    @FXML
    private Image pawnImageblue;
    @FXML
    private Image pawnImagegreen;
    @FXML
    private Image pawnImageyellow;


    //
    double cx, orgx;
    double cy, orgy;
    static String p1name = "player1", p2name = "player2";

//    @FXML
//    public void initialize() {
//        System.out.println("hello from initialize!");
//        text1 = new Label("player1");
//        text2 = new Label("player2");
//        text1 = new Text();
//        text2 = new Text();
//        text1.setText("PLayer1");
//        text2.setText("PLayer2");
//    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("hello from initialize!");
//        text1 = new Label("player1");
//        text2 = new Label("player2");
//        text1 = new Text();
//        text2 = new Text();
//        text1.setText("PLayer1");
//        text2.setText("PLayer2");
    }

//    public void move(MouseEvent actionEvent) throws IOException {
////        Bounds b = player1.localToScene(player1.getBoundsInLocal());
////        orgx = b.getMinX();
////        orgy = b.getMinY();
////        cx = orgx;
////        cy = orgy;
////
////        TranslateTransition tt = new TranslateTransition();
////        tt.setToX(actionEvent.getSceneX()-orgx);
////        tt.setToY(actionEvent.getSceneY()-orgy);
////        tt.setNode(player1);
////        tt.play();
//        System.out.println("x: " + actionEvent.getX() + " " + "y: " + actionEvent.getY());
//        // System.out.println("hello!");
//
//
//    }

    public void dicerolled(ActionEvent actionEvent) throws IOException {
        Dice d = new Dice(dicebtn);
        int n = d.roll();
        TranslateTransition tt = new TranslateTransition();
        tt.setToX(player1.getX() + n * 4);
        tt.setToY(player1.getY() - 0);
        tt.setNode(player1);

        player1.setX(player1.getX() + n * 4);
//        player1.setY(player1.getY()-0);

        System.out.println(n);
        System.out.println("x: " + player1.getX() + " " + "y" + player1.getY());
        if ((int) player1.getX() >= 194) {
            tt.setToY(player1.getY() - 10);
            player1.setY(player1.getY() - 10);
        }
        tt.play();
    }


//    public void Startgame(ActionEvent actionEvent) throws IOException {
//        Game.startgame();
//    }




//    public void settings(ActionEvent actionEvent) throws IOException {
////        Game.settings();
////    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource() == exit2) {
            Game.exit2();
        } else if (actionEvent.getSource() == exit4) {
            Game.exit4();
        } else if (actionEvent.getSource() == exit5) {
            Game.exit5();
        } else if (actionEvent.getSource() == Okay) {
            Game.exit6();
        } else if (actionEvent.getSource() == Menu) {
            Game.exit7();
        }
    }

//    public void play(ActionEvent actionEvent) throws IOException {
////        String p1name = "player1", p2name = "player2";
//        System.out.println("Hello!");
//
//        if (btn1.isSelected()) {
//            if (tf1.getText().trim().isEmpty() || tf2.getText().trim().isEmpty()) {
//            } else {
//                System.out.println("Hello from else1");
////                GamePlay.launchGame(tf1,tf2,dicebtn,pawnImageblue,pawnImagegreen);
//
//                p1name = tf1.getText();
//                System.out.println("Hello"+p1name);
//                text1.setText((String)p1name+"");
//
//                p2name = tf2.getText();
//
//                text2.setText((String) p2name+"");
//                System.out.println("p2name "+p2name);
//                System.out.println("hello from else1 202");
//                Game.play();
//            }
//        } else if (btn2.isSelected()) {
//            if (tf3.getText().trim().isEmpty() || tf4.getText().trim().isEmpty()) {
//            } else {
//                System.out.println("Hello from else2");
////                GamePlay.launchGame(tf3,tf4,dicebtn,pawnImagered,pawnImageyellow);
//                p1name = tf3.getText();
//                try{
//                    text1.setText(p1name);
//                }catch (Exception e){
//
//                }
//
//                p2name = tf4.getText();
//                try{
//                    text2.setText(p2name);
//                }catch(Exception e){
//
//                }
//
//                System.out.println("hello from else2 213");
//                Game.play();
//            }
//        }
//    }
        public void replay(ActionEvent actionEvent) throws IOException {
            Game.replay();
        }




    //    @FXML
//    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

}
