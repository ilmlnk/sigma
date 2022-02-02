package com.company.lesson8.ierarchy;

/* import com.company.lesson8.ierarchy.auto.Autobus;
import com.company.lesson8.ierarchy.auto.Car;
import com.company.lesson8.ierarchy.auto.CargoCar;
import com.company.lesson8.ierarchy.plane.CargoPlane;
import com.company.lesson8.ierarchy.plane.Fighter;
import com.company.lesson8.ierarchy.plane.PassengerPlane;
import com.company.lesson8.ierarchy.ship.CargoShip;
import com.company.lesson8.ierarchy.ship.PassengerShip;
import com.company.lesson8.ierarchy.ship.Tow; */

import java.util.Random;

public class TransportRun {

    public static void main(String[] args) {

        Random random = new Random();

        /* Flying transport */

        CargoPlane cargoPlane = new CargoPlane("Boeing 737", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), random.nextInt(5000, 15000));

        Fighter fighter = new Fighter("Shuttle", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), "Missile", random.nextInt(1, 8));

        PassengerPlane passengerPlane = new PassengerPlane("Mriya", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), random.nextInt(50, 80));

        wrapper();
        System.out.println(cargoPlane);
        wrapper();
        System.out.println(fighter);
        wrapper();
        System.out.println(passengerPlane);
        wrapper();


        /* Aquatic transport */

        CargoShip cargoShip = new CargoShip("Boeing 737", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), random.nextInt(5000, 15000));
        PassengerShip passengerShip = new PassengerShip("Boeing 737", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), random.nextInt(5000, 15000));
        Tow tow = new Tow("Boeing 737", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                random.nextInt(1, 4), random.nextInt(5000, 15000));

        wrapper();
        System.out.println(cargoShip);
        wrapper();
        System.out.println(passengerShip);
        wrapper();
        System.out.println(tow);
        wrapper();


        /* Terrestrial transport */

        Autobus autobus = new Autobus("Bogdan", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                generateSerialNumber(), random.nextInt(5000, 15000));
        Car car = new Car("BMW", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                generateSerialNumber(), random.nextInt(5000, 15000));
        CargoCar cargoCar = new CargoCar("Cargo", random.nextInt(100, 1000),
                random.nextInt(10, 50), random.nextInt(600, 1000),
                random.nextDouble(400, 700), random.nextInt(1, 3),
                generateSerialNumber(), random.nextInt(5000, 15000));

        wrapper();
        System.out.println(autobus);
        wrapper();
        System.out.println(car);
        wrapper();
        System.out.println(cargoCar);
        wrapper();

    }

    public static String generateSerialNumber() {
        Random random = new Random();

        StringBuilder serialNumber = new StringBuilder();
        for(int i = 0; i < 16; i++) {
            serialNumber.insert(i, random.nextInt(0, 9));
        }
        return serialNumber.toString();
    }

    public static void wrapper() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}


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
}

public class Plane extends Transport {
    protected int amountEngines;
    public Plane(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
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
}

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
}

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
}

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

public class Car extends Auto {
    private int accelerationTime;

    public Car(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
               int driverPlaces, String serialNumber, int accelerationTime) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, serialNumber);

        this.accelerationTime = accelerationTime;
    }

    public int getAccelerationTime() {
        return accelerationTime;
    }

    public void setAccelerationTime(int accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", accelerationTime=" + accelerationTime +
                '}';
    }
}

public class CargoCar extends Auto {
    private int loadCapacity;

    public CargoCar(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
                    int driverPlaces, String serialNumber, int loadCapacity) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, serialNumber);

        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "serialNumber='" + serialNumber + '\'' +
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

public class CargoPlane extends Plane {
    private int loadCapacity;

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

public class CargoShip extends Ship {
    private int loadCapacity;

    public CargoShip(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
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

    @Override
    public String toString() {
        return "CargoShip{" +
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

public class Tow extends Ship {
    private int loadShip;

    public Tow(String name, int fuelConsumption, int fuelCapacity, int maxSpeed, double speed,
               int driverPlaces, int amountEngines, int loadShip) {
        super(name, fuelConsumption, fuelCapacity, maxSpeed, speed, driverPlaces, amountEngines);

        this.loadShip = loadShip;
    }

    public int getLoadShip() {
        return loadShip;
    }

    public void setLoadShip(int loadShip) {
        this.loadShip = loadShip;
    }

    @Override
    public String toString() {
        return "Tow{" +
                "amountEngines=" + amountEngines +
                ", name='" + name + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", driverPlaces=" + driverPlaces +
                ", loadShip=" + loadShip +
                '}';
    }
}
