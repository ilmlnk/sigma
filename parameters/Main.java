package com.company.lesson2;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MathFunc m = new MathFunc();
        Random random = new Random();
        MultiplicationCarField mp = new MultiplicationCarField();

        m.mathOperation("pow", 10.5, 8.5);
        System.out.println("Result: " + new DecimalFormat("#0.00").format(m.getOperandDoubleFirst()));

        Car[] cars = new CarGeneration().generate();

        wrapper();
        for (Car car : cars) System.out.println(car);
        wrapper();

        System.out.println("Result: " + mp.operationMultiply("price".toLowerCase(Locale.ROOT),
                cars[random.nextInt(cars.length)], 10));
    }

    public static void wrapper() {
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
