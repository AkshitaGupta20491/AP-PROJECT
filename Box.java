package com.example.demo;

public class Box {
    private final double x;
    private final double y;
    private final int number;
    private final String status;

    public Box(double xx,double yy, int n, String s){
        this.x=xx;
        this.y=yy;
        this.number=n;
        this.status=s;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getStatus() {
        return status;
    }

    public int getNumber() {
        return number;
    }


}
