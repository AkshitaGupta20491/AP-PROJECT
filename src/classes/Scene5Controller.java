package com.example.demo;

import com.sun.javafx.sg.prism.NGNode;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Scene5Controller {
    
    public ImageView bigpawn2;
    public ImageView bigpawn1;
    public ImageView smallpawn2;
    public ImageView smallpawn1;
    public ImageView glow1;
    public ImageView glow2;
    @FXML
    private Label text1;

    @FXML
    private ImageView diceimage;

    @FXML
    private ImageView jumpingarrow;

    @FXML
    private Label text2;

//    @FXML
//    private Group group;




    @FXML
    private BorderPane borderpane;

//    public void groupSetter( Group g){
//
//        this.group = g;
//
//    }



    public ImageView getdiceimage(){

        return diceimage;
    }
    public void setDiceimage(ImageView iv){
        diceimage = iv;
        borderpane.getChildren().add(diceimage);
    }

//    public Group diceanimationgetter(){
//        return this.group;
//    }

    @FXML
    void diceroll(MouseEvent event) throws IOException, InterruptedException {
        System.out.println("Hello entered in diceroll");
//        groupSetter(GamePlay.diceanimation());
//        setonborderpane();
//        group.getChildren().clear();
        startstopjumpingarrow(false);
        GamePlay.newdiceanimation();




        System.out.println("hello! from diceroll");
    }


    public void jumpingarrowset(ImageView iv){
        this.jumpingarrow = iv;
    }
//    public void setonborderpane(){
//        borderpane.getChildren().add(group);
//
//    }

    public BorderPane getBorderpane(){
        return borderpane;
    }

    public void setonimageview(){
        borderpane.getChildren().add(jumpingarrow);
    }

    public void setpawnimages(Image iv1, Image iv2){
        this.bigpawn1.setImage(iv1);
        this.bigpawn2.setImage(iv2);
        this.smallpawn1.setImage(iv1);
        this.smallpawn2.setImage(iv2);
    }

    public ImageView getBigpawn2() {
        return bigpawn2;
    }

    public ImageView getBigpawn1() {
        return bigpawn1;
    }

    public void startstopjumpingarrow(Boolean b){
        System.out.println("Hello from startstop");
        jumpingarrow.setVisible(b);
    }


    public void startstopdiceanimation(Boolean b){
        diceimage.setVisible(b);
    }





    @FXML
    void exit5(MouseEvent event) throws IOException {
        Game.exit5();
    }
    void setValues(String s1, String s2){
text1.setText(s1);text2.setText(s2);
    }




}
