package com.company.lesson8.hierarchy.ship;

import com.company.lesson8.hierarchy.Ship;

public class PassengerShip extends Ship {
    private int amountPassengers;

    public PassengerShip(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                         int driverPlaces, int amountEngines, int amountPassengers) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

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
        if (!(o instanceof PassengerShip)) return false;
        PassengerShip that = (PassengerShip) o;
        return amountPassengers == that.amountPassengers;
    }

    @Override
    public String toString() {
        return "PassengerShip{" +
                "amountEngines=" + amountEngines +
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
