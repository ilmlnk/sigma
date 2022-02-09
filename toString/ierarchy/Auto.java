package com.company.lesson8.ierarchy;

public class Auto extends Transport {
    protected String serialNumber;

    public Auto(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed, int driverPlaces,
                String serialNumber) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces);

        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                '}';
    }
}
