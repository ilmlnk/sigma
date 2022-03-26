package serial.service;
import serial.dto.Plane;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static serial.service.SerializeProcess.PATH;

public class DeSerializeProcess {
    private static final String FILEPATH = "planeSerialize";

    public static boolean deserialize() {
        ArrayList<Plane> deserializeList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH + FILEPATH))) {
            deserializeList.add((Plane) ois.readObject());
            System.out.println(deserializeList);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("It is not possible to perform operations with deserialization!");
            return false;
        }
        return true;
    }
}
