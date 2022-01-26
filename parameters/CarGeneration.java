package com.company.lesson2;

import java.util.Random;

public class CarGeneration {
    public Car[] generate() {
        Random random = new Random();
        int size = 10;
        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(random.nextDouble(10000, 20000), random.nextDouble(5000, 7000),
                    random.nextDouble(150, 220));
        }
        return cars;
    }
}
