package com.example.demo;

public class Ladder {
private final Box end;
private final Box start;



    public Ladder(Box e,Box s){
        this.end=e;
        this.start=s;
    }

    public Box getEnd() {
        return end;
    }

    public Box getStart() {
        return start;
    }

}
