package com.company.lesson8.hierarchy.plane;

import com.company.lesson8.hierarchy.BoardingPassengers;
import com.company.lesson8.hierarchy.people.Driver;
import com.company.lesson8.hierarchy.Plane;
import com.company.lesson8.hierarchy.people.Passenger;

public class PassengerPlane extends Plane implements BoardingPassengers {
    private int amountPassengers;
    private Passenger[] passengers;
    private int countPassengers;
    private int countDrivers;

    public PassengerPlane(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                          int driverPlaces, int amountEngines, int amountPassengers) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.amountPassengers = amountPassengers;
        this.countPassengers = 0;
        this.countDrivers = 0;
    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        this.amountPassengers = amountPassengers;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
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
        if (!(o instanceof PassengerPlane)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return amountPassengers == that.amountPassengers;
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
    public boolean addPassenger(String name, String surname, String patronymic, int age) {
        if (countPassengers < passengers.length) {
            Passenger passenger = new Passenger(name, surname, patronymic, age);
            passengers[countPassengers] = passenger;
            ++countPassengers;
            System.out.println("The passenger was added successfully.");
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePassenger(int id) {
        for (int i = 0; i < passengers.length - 1; i++) {
            if (++i == id) {
                passengers[i] = new Passenger();
                return true;
            }
        }
        return false;
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
