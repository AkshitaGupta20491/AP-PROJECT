package com.example.demo;

public class Box {
    private  double x;
    private  double y;
    private final int number;
    private  int status;  // 0: empty 1:ladder -1:snake
    private int spcno;

    public int getSpcno() {
        return spcno;
    }

    public void setSpcno(int spcno) {
        this.spcno = spcno;
    }

    public Box(double xx, double yy, int n){
        this.x=xx;
        this.y=yy;
        this.number=n;
        status = 0;

    }

    public double getX() {
        return x;
    }
    public void setStatus(int n){this.status=n;}
    public void setX(double xx){this.x=xx;}
    

    public double getY() {
        return y;
    }

    public int getStatus() {
        return status;
    }

    public int getNumber() {
        return number;
    }


}
