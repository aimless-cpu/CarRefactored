package com.company;

public class Car {
    //instance
    private String color;
    private int velocityMax;
    private double price;
    private double priceDiscount; //price - producer.discount
    private double consumption;
    private double consumptionIncreased; //consumption * 1.098
    //private double amountFuel;
    private double amountDriven;
    private Engine engine;
    private Producer producer;

    //constructor
    public Car(String color, int velocityMax, double price, double priceDiscount, double consumption, double consumptionIncreased,
               Engine engine) {
        this.color = color;
        this.velocityMax = velocityMax;
        this.price = price;
        this.priceDiscount = priceDiscount;
        this.consumption = consumption;
        this.consumptionIncreased = consumptionIncreased;
        //Engine
        this.engine = engine;
        //Producer
        this.producer = producer;
    }

    //method

    public double getPriceDiscount(double price, double discount) {
        this.priceDiscount = this.price - this.producer.discount;
        return priceDiscount;
    }

    public double hasConsumptionIncreased() {
        if (amountDriven>50000)

    }



}
