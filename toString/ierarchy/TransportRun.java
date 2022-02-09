package com.company.lesson8.ierarchy;

import com.company.lesson8.ierarchy.auto.Autobus;
import com.company.lesson8.ierarchy.auto.Car;
import com.company.lesson8.ierarchy.auto.CargoCar;
import com.company.lesson8.ierarchy.plane.CargoPlane;
import com.company.lesson8.ierarchy.plane.Fighter;
import com.company.lesson8.ierarchy.plane.PassengerPlane;
import com.company.lesson8.ierarchy.ship.CargoShip;
import com.company.lesson8.ierarchy.ship.PassengerShip;
import com.company.lesson8.ierarchy.ship.Tow;

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
