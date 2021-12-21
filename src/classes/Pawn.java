package com.example.demo;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;

public class Pawn implements Serializable {


    private Box position;
    private ImageView pawniv;


    public Pawn(Box position,ImageView iv) {
        pawniv = iv;
        this.position = position;

    }
    public ImageView getPawniv() {
        return pawniv;
    }

    public Box getPosition() {
        return position;
    }

    public void setPosition(Box position) {
        this.position = position;
    }



}
