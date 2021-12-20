package com.example.demo;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

public class player{
//    private final int id;
    private final String name;
    private boolean isstart;

    public void setIsstart(boolean isstart) {
        this.isstart = isstart;
    }

    private Pawn pawn;




//    public player(int i,String name){
//        id = i;
//        this.name = name;
//
//    }
    public player(String s, Boolean b,Pawn p){
//        this.id=n;
        this.name=s;
        isstart = b;
        pawn = p;

    }

    public String getName() {
        return name;}

    public boolean getStart() {
        return isstart;
    }

    public Pawn getPawn() {
        return pawn;
    }
//    public int getId() {
//        return id;
//    }

    
    void roll(Dice dice){
        dice.roll();
    }

    @Override
    public boolean equals(Object o){
        if(o!=null && getClass()==o.getClass()){
            player p1 = (player) o;
            return this.name.equals(p1.name);
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
       return "name: "+this.name;
    }

}