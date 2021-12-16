package com.example.demo;

public class Pawn {
    private Box position;
    private final String color;

    public Pawn(Box position, String color) {
        this.position = position;
        this.color = color;
    }

    public Box getPosition() {
        return position;
    }

    public void setPosition(Box position) {
        this.position = position;
    }

    public String getColor() {
        return color;
    }
}
