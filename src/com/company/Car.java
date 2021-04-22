package com.company;

public class Car {
    //instance
    private String color;
    private int velocityMax;
    private double price;
    private double priceReduced; //price * producer.discount
    private double consumption;
    private double consumptionIncreased; //consumption * 1.098
    //private double amountFuel;
    //Konstante for limes to increase consumption (look in function hasConsumptionIncrease)
    private double amountDriven;
    private Engine engine;
    private Producer producer;

    //constructor
    public Car(String color, int velocityMax, double price, double consumption,
               Engine engine, Producer producer) {
        this.color = color;
        this.velocityMax = velocityMax;
        this.price = price;
        this.consumption = consumption;
            //this.consumptionIncreased = consumptionIncreased;
        //Engine
        this.engine = engine;
        //Producer
        this.producer = producer;
    }

    //method
    public void getPriceDiscount() {
        this.priceReduced = this.price * (1 - producer.getDiscount());
        System.out.println(priceReduced);
    }


/*
    public double getConsumptionIncreased() {   //Better as Boolean? hasConsumptionIncreased()
        if (amountDriven>50000) {
            return this.consumption*1.098;
        }
        return this.consumption;
    }*/

    //getter setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocityMax() {
        return velocityMax;
    }

    public void setVelocityMax(int velocityMax) {
        this.velocityMax = velocityMax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceReduced() {
        return priceReduced;
    }

    public void setPriceReduced(double priceReduced) {
        this.priceReduced = priceReduced;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void setConsumptionIncreased(double consumptionIncreased) {
        this.consumptionIncreased = consumptionIncreased;
    }

    public double getAmountDriven() {
        return amountDriven;
    }

    public void setAmountDriven(double amountDriven) {
        this.amountDriven = amountDriven;
    }


    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
