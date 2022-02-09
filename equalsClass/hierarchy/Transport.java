package com.company.lesson8.hierarchy;

import java.util.Objects;

public abstract class Transport {
    protected static int id;
    protected String name;
    protected int fuelConsumption;
    protected int fuelCapacity;
    protected double speed;
    protected int maxSpeed;
    protected int driverPlaces;

    public Transport(String name, int fuelConsumption, int fuelCapacity, int maxSpeed,
                     double speed, int driverPlaces) {
        invokeID();
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
        this.driverPlaces = driverPlaces;
    }

    private static void invokeID() {
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Transport.id = id;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPlaces() {
        return driverPlaces;
    }

    public void setPlaces(int driverPlaces) {
        this.driverPlaces = driverPlaces;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return fuelConsumption == transport.fuelConsumption &&
                fuelCapacity == transport.fuelCapacity && Double.compare(transport.speed, speed) == 0
                && maxSpeed == transport.maxSpeed && driverPlaces == transport.driverPlaces
                && Objects.equals(name, transport.name);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                '}';
    }
}

