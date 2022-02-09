package com.company.lesson8.hierarchy.plane;

import com.company.lesson8.hierarchy.Plane;

public class PassengerPlane extends Plane {
    private int amountPassengers;

    public PassengerPlane(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
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
        if (!(o instanceof PassengerPlane)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return amountPassengers == that.amountPassengers;
    }


    @Override
    public String toString() {
        return "PassengerPlane{" +
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
