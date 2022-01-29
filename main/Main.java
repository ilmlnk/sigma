package com.company.lesson3;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            System.out.println(new Marks().showMarks(random.nextInt(0,5)));
        }

        wrapper();
        for (int i = 0; i < 10; i++) {
            System.out.println(new Planets().showPlanets(random.nextInt(1,8)));
        }

        wrapper();
        for (int i = 0; i < 10; i++) {
            System.out.println(new WeekDays().showWeekdays(random.nextInt(1,7)));
        }
        wrapper();
    }

    public static void wrapper() {
        for (int i = 0; i < 75; i++) System.out.print("-");
        System.out.println();
    }
}
