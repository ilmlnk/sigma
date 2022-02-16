package com.company.lesson8.hierarchy.people;

public class Driver {
    private static int id;
    private String name;
    private String surname;
    private String patronymic;
    private String driverCategory;
    private int age;

    public Driver() {
        this.name = null;
        this.surname = null;
        this.patronymic = null;
        this.driverCategory = null;
        this.age = 0;
    }

    public Driver(String name, String surname, String patronymic, String driverCategory, int age) {
        invokeID();
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.driverCategory = driverCategory;
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

    public String getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(String driverCategory) {
        this.driverCategory = driverCategory;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", driverCategory='" + driverCategory + '\'' +
                ", age=" + age +
                '}';
    }
}
