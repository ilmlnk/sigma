package com.company.lesson8.hierarchy;

public class Ship extends Transport {
    protected int amountEngines;
    public Ship(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
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
        if (!(o instanceof Ship)) return false;
        Ship ship = (Ship) o;
        return amountEngines == ship.amountEngines;
    }


    @Override
    public String toString() {
        return "Ship{" +
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
