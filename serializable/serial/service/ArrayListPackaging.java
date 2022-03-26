package serial.service;

import serial.dto.Plane;
import serial.dto.Ship;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListPackaging implements Serializable {

    public static void arrayListPackaging(Object... objects) {
        ArrayList<Plane> planes = new ArrayList<>();
        ArrayList<Ship> ships = new ArrayList<>();

        for (Object o : objects) {
            if (o instanceof Plane) {
                planes.add((Plane) o);
            } else if (o instanceof Ship) {
                ships.add((Ship) o);
            } else {
                System.out.println("Object " + o + "is not an instance of Plane or Ship.");
                throw new RuntimeException();
            }
        }
        planes.stream()
                .sorted(Comparator.comparing(Plane::getProductionYear));
        System.out.println(planes);
        ships.stream()
                .sorted(Comparator.comparing(Ship::getProductionYear));

        SerializeProcess.serialize(planes);
        ExternalizeProcess.externalize(ships);
    }
}
