package com.company.lesson8.hierarchy.plane;

import com.company.lesson8.hierarchy.Plane;

public class CargoPlane extends Plane {
    private int loadCapacity;

    public CargoPlane(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
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
        if (!(o instanceof CargoPlane)) return false;
        CargoPlane that = (CargoPlane) o;
        return loadCapacity == that.loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
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
