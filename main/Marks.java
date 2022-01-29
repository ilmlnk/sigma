package com.company.lesson3;

import java.util.ArrayList;

public class Marks {
    ArrayList<String> showMarks(int mark) throws Exception {
        ArrayList <String> marks = new ArrayList<>();
        switch (mark) {
            case 0, 1, 2 -> {
                marks.add("Unsatisfactory");
            }
            case 3 -> {
                marks.add("Satisfactory");
            }
            case 4 -> {
                marks.add("Good");
            }
            case 5 -> {
                marks.add("Excellent");
            }
            default -> {
                throw new Exception("There's no mark ");
            }
        }
        return marks;
    }
}
