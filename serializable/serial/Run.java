package serial;

import serial.dto.*;
import serial.service.ArrayListPackaging;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Object[] objects;

        Engine engine1 = new Engine("Diesel", 200);
        Engine engine2 = new Engine("95", 400);
        Engine engine3 = new Engine("Cruise", 350);
        /* int load,
        int diameter */
        Wheel wheel1 = new Wheel(1000, 20);
        Wheel wheel2 = new Wheel(1500, 30);
        /* Wheel wheel,
        int wheelAmount */
        Chassis chassis1 = new Chassis(wheel1, 4);
        Chassis chassis2 = new Chassis(wheel2, 6);
        /* int passengerAmount,
        String material */
        Boat boat1 = new Boat(150, "Metal");

        /* int velocity, int productionYear, Engine engine,
                 String model, int flyingRange, Chassis chassis */
        Plane plane1 = new Plane(500, 2003, engine1,
                "Boeing", 20000, chassis1);
        Plane plane2 = new Plane(600, 2005, engine2,
                "Boeing 737", 20000, chassis2);
        /* int velocity, int productionYear, Engine engine,
                int waterWeight, double length, Boat boat */
        Ship ship1 = new Ship(50, 2005, engine3,
                5000, 125.5, boat1);

        objects = new Object[]{plane1, plane2, ship1};
        ArrayListPackaging.arrayListPackaging(objects);
    }
}
