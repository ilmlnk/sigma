package com.company.lesson8.hierarchy.people;

public class Passenger {
    private static int id;
    private String name;
    private String surname;
    private String patronymic;
    private int age;

    public Passenger() {
        this.name = null;
        this.surname = null;
        this.patronymic = null;
        this.age = 0;
    }

    public Passenger(String name, String surname, String patronymic, int age) {
        invokeID();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    private void invokeID() {
        id++;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }
}
