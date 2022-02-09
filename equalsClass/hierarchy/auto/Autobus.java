package com.company.lesson8.hierarchy.auto;

import com.company.lesson8.hierarchy.Auto;

public class Autobus extends Auto {
    private int amountPassengers;

    public Autobus(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                   int driverPlaces, String serialNumber, int amountPassengers) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, serialNumber);

        this.amountPassengers = amountPassengers;
    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        this.amountPassengers = amountPassengers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autobus)) return false;
        Autobus autobus = (Autobus) o;
        return amountPassengers == autobus.amountPassengers;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", amountPassengers=" + amountPassengers +
                '}';
    }
}
