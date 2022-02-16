package com.company.lesson8.hierarchy;

public interface TransportImpl {
    boolean accelerate(int acceleratedSpeed);
    boolean brake(int reducedSpeed);
    boolean addDriver(String name, String surname, String patronymic, String driverCategory, int age);
    boolean deleteDriver(int id);
}
