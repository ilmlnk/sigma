package com.company.lesson8.hierarchy.plane;

import com.company.lesson8.hierarchy.LoadingCargo;
import com.company.lesson8.hierarchy.people.Driver;
import com.company.lesson8.hierarchy.Plane;

public class CargoPlane extends Plane implements LoadingCargo {
    private int loadCapacity;
    private static double currentLoadCapacity;

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

    public static double getCurrentLoadCapacity() {
        return currentLoadCapacity;
    }

    public static void setCurrentLoadCapacity(double currentLoadCapacity) {
        CargoPlane.currentLoadCapacity = currentLoadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        CargoPlane that = (CargoPlane) o;
        return loadCapacity == that.loadCapacity;
    }

    @Override
    public boolean accelerate(int acceleratedSpeed) {
        if (super.speed < 0) return false;
        else if (super.speed > super.maxSpeed) return false;
        else {
            super.speed += acceleratedSpeed;
            System.out.println("The speed has been increased by " + acceleratedSpeed + " km/h.");
        }
        return true;
    }

    @Override
    public boolean brake(int reducedSpeed) {
        if (super.speed < 0) return false;
        else {
            super.speed -= reducedSpeed;
            System.out.println("The speed has been decreased by " + reducedSpeed + " km/h.");
        }
        return true;
    }

    @Override
    public boolean addDriver(String name, String surname, String patronymic, String driverCategory, int age) {
        int count = 0;
        if (count < drivers.length) {
            Driver driver = new Driver(name, surname, patronymic, driverCategory, age);
            drivers[count] = driver;
            ++count;
            System.out.println("The driver was added successfully.");
            return true;
        }
        return false;
    }


    @Override
    public boolean addCargo(double kg) {
        if (currentLoadCapacity < loadCapacity) {
            currentLoadCapacity += kg;
            return true;
        }
        return false;
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
