package com.company.lesson8.ierarchy.plane;

import com.company.lesson8.ierarchy.Plane;

public class Fighter extends Plane {
    private String weapon;
    private int amountWarhead;

    public Fighter(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                   int driverPlaces, int amountEngines, String weapon, int amountWarhead) {

        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.weapon = weapon;
        this.amountWarhead = amountWarhead;
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
