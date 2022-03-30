package collections.service;

import collections.dto.Point;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import static collections.service.RecordData.FILE_DIRECTORY;
import static collections.service.RecordData.FILE_LOCATION;

public class ExtractData {
    public static void extractCalculations() {
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_DIRECTORY + FILE_LOCATION);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            HashMap<Point, Integer> extractedPointMap = (HashMap<Point, Integer>) objectInputStream.readObject();
            System.out.println(extractedPointMap);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("It is not possible to perform operation!");
        }
    }
}
