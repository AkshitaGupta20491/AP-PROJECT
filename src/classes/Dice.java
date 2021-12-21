package com.example.demo;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.Math;
import java.util.Random;

public class Dice implements Serializable {
    int number;

    Button bt;

    Dice(Button dicebtn) throws FileNotFoundException {
        bt = dicebtn;
        InputStream stream = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice6.png");
        Image img = new Image(stream);
        ImageView iv = new ImageView();
        iv.setImage(img);

        iv.fitWidthProperty().bind(dicebtn.widthProperty());
        iv.fitHeightProperty().bind(dicebtn.heightProperty());
        iv.setPreserveRatio(true);

        dicebtn.setGraphic(iv);
    }

    int roll(){
        Random rd = new Random();
        int n = rd.nextInt(6)+1;
        number=n;
        return n;
    }

}
