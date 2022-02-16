package com.company.lesson8.hierarchy.ship;

import com.company.lesson8.hierarchy.people.Driver;
import com.company.lesson8.hierarchy.LoadingCargo;
import com.company.lesson8.hierarchy.Ship;

public class Tow extends Ship implements LoadingCargo {
    private int loadShip;
    private String typeCargo;
    private static double currentLoadCapacity;

    public Tow(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
               int driverPlaces, int amountEngines, int loadShip, String typeCargo) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.loadShip = loadShip;
        this.typeCargo = typeCargo;
    }

    public int getLoadShip() {
        return loadShip;
    }

    public void setLoadShip(int loadShip) {
        this.loadShip = loadShip;
    }

    public String getTypeCargo() {
        return typeCargo;
    }

    public void setTypeCargo(String typeCargo) {
        this.typeCargo = typeCargo;
    }

    public static double getCurrentLoadCapacity() {
        return currentLoadCapacity;
    }

    public static void setCurrentLoadCapacity(double currentLoadCapacity) {
        Tow.currentLoadCapacity = currentLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tow)) return false;
        Tow tow = (Tow) o;
        return loadShip == tow.loadShip;
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
        for (int i = 0; i < drivers.length - 1; i++) {
            if (id == ++i) {
                drivers[i] = new Driver();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addCargo(double kg) {
        if (currentLoadCapacity < loadShip) {
            currentLoadCapacity += kg;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tow{" +
                "amountEngines=" + amountEngines +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", loadShip=" + loadShip +
                '}';
    }
}
