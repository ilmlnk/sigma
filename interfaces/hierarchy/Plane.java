package com.company.lesson8.hierarchy;

import com.company.lesson8.hierarchy.people.Driver;

public class Plane extends Transport {
    protected int amountEngines;
    protected Driver[] drivers = new Driver[driverPlaces];

    public Plane(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                 int driverPlaces, int amountEngines) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces);

        this.amountEngines = amountEngines;
    }

    public int getAmountEngines() {
        return amountEngines;
    }

    public void setAmountEngines(int amountEngines) {
        this.amountEngines = amountEngines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return amountEngines == plane.amountEngines;
    }

    @Override
    public boolean accelerate(int acceleratedSpeed) {
        if (super.speed < 0) return false;
        else if (super.speed > super.maxSpeed) return false;
        else {
            super.speed += acceleratedSpeed;
            System.out.println("The speed has been increased by " + acceleratedSpeed + " km/h.");
        }
        return true;
    }

    @Override
    public boolean brake(int reducedSpeed) {
        if (super.speed < 0) return false;
        else {
            super.speed -= reducedSpeed;
            System.out.println("The speed has been decreased by " + reducedSpeed + " km/h.");
        }
        return true;
    }

    @Override
    public boolean addDriver(String name, String surname, String patronymic, String driverCategory, int age) {
        int count = 0;
        if (count < drivers.length) {
            Driver driver = new Driver(name, surname, patronymic, driverCategory, age);
            drivers[count] = driver;
            ++count;
            System.out.println("The driver was added successfully.");
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDriver(int id) {
        return false;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "amountEngines=" + amountEngines +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                '}';
    }
}
