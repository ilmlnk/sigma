package com.company.lesson8.hierarchy.plane;

import com.company.lesson8.hierarchy.people.Driver;
import com.company.lesson8.hierarchy.Plane;

import java.util.Objects;

public class Fighter extends Plane {
    private String weapon;
    private int countDrivers;
    private int amountWarhead;

    public Fighter(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                   int driverPlaces, int amountEngines, String weapon, int amountWarhead) {

        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.weapon = weapon;
        this.amountWarhead = amountWarhead;
        this.countDrivers = 0;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getAmountWarhead() {
        return amountWarhead;
    }

    public void setAmountWarhead(int amountWarhead) {
        this.amountWarhead = amountWarhead;
    }

    public int getCountDrivers() {
        return countDrivers;
    }

    public void setCountDrivers(int countDrivers) {
        this.countDrivers = countDrivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fighter)) return false;
        Fighter fighter = (Fighter) o;
        return amountWarhead == fighter.amountWarhead && Objects.equals(weapon, fighter.weapon);
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
        if (countDrivers < drivers.length) {
            Driver driver = new Driver(name, surname, patronymic, driverCategory, age);
            drivers[countDrivers] = driver;
            ++countDrivers;
            System.out.println("The driver was added successfully.");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "amountEngines=" + amountEngines +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", weapon='" + weapon + '\'' +
                ", amountWarhead=" + amountWarhead +
                '}';
    }
}
