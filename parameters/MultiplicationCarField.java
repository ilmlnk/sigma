package com.company.lesson2;

import java.util.Locale;

public class MultiplicationCarField {

    public MultiplicationCarField() {

    }

    public double operationMultiply(String fieldCar, Car car, double constant) {
            switch (fieldCar) {
                case "price" -> {
                    return car.getPrice() * constant;
                }
                case "weight" -> {
                    return car.getWeight() * constant;
                }
                case "speed" -> {
                    return car.getSpeed() * constant;
                }
                default -> {
                    return 0;
                }
            }
    }
}
