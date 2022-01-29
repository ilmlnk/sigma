package com.company.lesson3;

import java.util.ArrayList;

public class Planets {
    ArrayList<String> showPlanets(int planet) throws Exception {
        ArrayList<String> planets = new ArrayList<>();
        switch (planet) {
            case 1 -> {
                planets.add("Mercury");
            }
            case 2 -> {
                planets.add("Venus");
            }
            case 3 -> {
                planets.add("Earth");
            }
            case 4 -> {
                planets.add("Mars");
            }
            case 5 -> {
                planets.add("Jupiter");
            }
            case 6 -> {
                planets.add("Saturn");
            }
            case 7 -> {
                planets.add("Uran");
            }
            case 8 -> {
                planets.add("Neptune");
            }
            default -> {
                throw new Exception("There's no planet in the output.");
            }
        }
        return planets;
    }
}
