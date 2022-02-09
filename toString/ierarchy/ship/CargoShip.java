package com.company.lesson8.ierarchy.ship;

import com.company.lesson8.ierarchy.Ship;

public class CargoShip extends Ship {
    private int loadCapacity;

    public CargoShip(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                     int driverPlaces, int amountEngines, int loadCapacity) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoShip{" +
                "amountEngines=" + amountEngines +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
