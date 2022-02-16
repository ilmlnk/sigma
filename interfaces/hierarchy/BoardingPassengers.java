package com.company.lesson8.hierarchy;

public interface BoardingPassengers {
    boolean addPassenger(String name, String surname, String patronymic, int age);
    boolean deletePassenger(int id);
}
