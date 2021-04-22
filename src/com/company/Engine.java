package com.company;

public class Engine {
    //instance
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;

    //constructor
    public Engine(int horsePower,TYPE type) {
        this.type = type;
        this.horsePower = horsePower;
    }

    //getter setter
    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
