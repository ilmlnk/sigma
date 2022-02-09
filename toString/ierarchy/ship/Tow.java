package com.company.lesson8.ierarchy.ship;

import com.company.lesson8.ierarchy.Ship;

public class Tow extends Ship {
    private int loadShip;

    public Tow(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
               int driverPlaces, int amountEngines, int loadShip) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.loadShip = loadShip;
    }

    public int getLoadShip() {
        return loadShip;
    }

    public void setLoadShip(int loadShip) {
        this.loadShip = loadShip;
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
