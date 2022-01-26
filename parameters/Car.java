package com.company.lesson2;

import java.text.DecimalFormat;

public class Car {
    private double price;
    private double weight;
    private double speed;

    public Car() {
        this.price = 0;
        this.weight = 0;
        this.speed = 0;
    }

    public Car(double price, double weight, double speed) {
        this.price = price;
        this.weight = weight;
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + new DecimalFormat("#0.00").format(price) +
                ", weight=" + new DecimalFormat("#0.00").format(weight) +
                ", speed=" + new DecimalFormat("#0.00").format(speed) +
                '}';
    }
}
