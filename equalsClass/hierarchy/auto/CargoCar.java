package com.company.lesson8.hierarchy.auto;

import com.company.lesson8.hierarchy.Auto;

public class CargoCar extends Auto {
    private int loadCapacity;

    public CargoCar(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                    int driverPlaces, String serialNumber, int loadCapacity) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, serialNumber);

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
        if (!(o instanceof CargoCar)) return false;
        CargoCar cargoCar = (CargoCar) o;
        return loadCapacity == cargoCar.loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "serialNumber='" + serialNumber + '\'' +
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
