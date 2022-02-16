package com.company.compareArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Run {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Random random = new Random();
        Person person = new Person();
        for (int i = 0; i < 8; i++) {
            Person createPerson = new Person(generateString(), generateString(),
                    random.nextInt(1995, 2005), random.nextBoolean());
            people.add(createPerson);
        }
        person.compareObjects(people, "1");
        person.compareObjects(people, "2");
        person.compareObjects(people, "3");

    }
    private static String generateString() {
        long result = 0;
        StringBuilder name = new StringBuilder();
        for (int i = 3; i < (int) (Math.random() * 16); i++) {
            result = (int) (Math.random() * 25 + 65);
            name.append((char) result);
        }
        return name.toString();
    }

}
