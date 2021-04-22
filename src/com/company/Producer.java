package com.company;

public class Producer {

    //instance
    private double discount;
    private String name;
    private String origin;

    //constructor
    public Producer(double discount, String name, String origin) {
        this.discount = discount;
        this.name = name;
        this.origin = origin;
    }

    //method

    //getter setter
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
