package com.company.compareArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Person {
    private String name;
    private String region;
    private int birthYear;
    private boolean isMale;

    public Person() {
        this.name = null;
        this.region = null;
        this.birthYear = 0;
        this.isMale = false;
    }

    public Person(String name, String region, int birthYear, boolean isMale) {
        this.name = name;
        this.region = region;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void compareObjects(ArrayList<Person> people, String caseSort) {
        switch (caseSort) {
            case "1" -> people.sort(Comparator.comparing(Person::getRegion));
            case "2" -> people.sort(Comparator.comparing(Person::getBirthYear));
            case "3" -> people.sort(Comparator.comparing(Person::isMale));
            default -> people.sort(Comparator.comparing(Person::getName));
        }
        System.out.println(people);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", birthYear=" + birthYear +
                ", isMale=" + isMale +
                '}';
    }
}
