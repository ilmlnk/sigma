package com.company.lesson3;

import java.util.ArrayList;

public class WeekDays {
    ArrayList<String> showWeekdays(int day) throws Exception {
        ArrayList<String> days = new ArrayList<>();
        switch (day) {
            case 1 -> {
                days.add("Monday");
            }
            case 2 -> {
                days.add("Tuesday");
            }
            case 3 -> {
                days.add("Wednesday");
            }
            case 4 -> {
                days.add("Thursday");
            }
            case 5 -> {
                days.add("Friday");
            }
            case 6 -> {
                days.add("Saturday");
            }
            case 7 -> {
                days.add("Sunday");
            }
            default -> {
                throw new Exception("There's no planet in the output.");
            }
        }
        return days;
    }
}
