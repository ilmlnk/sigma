package serial.service;

import serial.dto.Ship;

import java.io.*;
import java.util.ArrayList;

import static serial.service.SerializeProcess.PATH;

public class ExternalizeProcess {
    private static final String FILEPATH = "externalizeShip";

    public static void externalize(ArrayList<Ship> shipList) {
        ArrayList<Ship> externalizedList = new ArrayList<>();
        try {
            FileOutputStream fo = new FileOutputStream(PATH + FILEPATH);
            ObjectOutputStream so = new ObjectOutputStream(fo);
            for (Ship s : shipList) {
                so.writeObject(s);
                so.flush();
            }

            FileInputStream fis = new FileInputStream(PATH + FILEPATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            externalizedList.add((Ship) ois.readObject());

            System.out.println(shipList);
            System.out.println(externalizedList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("It is not possible to perform operations with externalization!");
        }
    }
}
