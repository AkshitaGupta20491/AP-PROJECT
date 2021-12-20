package com.example.demo;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pawn {
    public ImageView getPawniv() {
        return pawniv;
    }

    private Box position;
    private ImageView pawniv;


    public Pawn(Box position,ImageView iv) {
        pawniv = iv;
        this.position = position;

    }

    public Box getPosition() {
        return position;
    }

    public void setPosition(Box position) {
        this.position = position;
    }



}
