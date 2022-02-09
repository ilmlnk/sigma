package com.company.lesson8.hierarchy.ship;

import com.company.lesson8.hierarchy.Ship;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoShip)) return false;
        CargoShip cargoShip = (CargoShip) o;
        return loadCapacity == cargoShip.loadCapacity;
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
