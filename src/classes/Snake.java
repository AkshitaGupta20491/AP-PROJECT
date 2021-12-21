package com.example.demo;

import java.io.Serializable;

public class Snake implements Serializable {
    private final Box end;
    private final Box start;



    public Snake(Box e,Box s){
        this.end = e;
        this.start = s;

    }

    public Box getEnd() {
        return end;
    }

    public Box getStart() {
        return start;
    }

}
