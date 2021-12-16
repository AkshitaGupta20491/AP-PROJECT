package com.example.demo;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

public class player{
    private final int id;
    private final String name;
    private final Image img;
    private final Pawn pn;

    public player(String s, int n, Image i, Pawn p){
        this.id=n;
        this.name=s;
        this.img=i;
        this.pn=p;
    }

    public String getName() {
        return name;}

    public Image getImg() {
        return img;
    }

    public int getId() {
        return id;
    }

    ImageView view(){
        ImageView iv = new ImageView();
        iv.setImage(img);
        return iv;

    }
    
    void roll(Dice dice){
        dice.roll();
    }
}