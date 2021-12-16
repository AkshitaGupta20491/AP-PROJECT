package com.example.demo;

import javafx.scene.image.Image;
import java.lang.Math;
import java.util.Random;

public class Dice {
    int number;
    Image img;

    int roll(){
        Random rd = new Random();
        int n = rd.nextInt(6)+1;
        number=n;
        return n;
    }

}
