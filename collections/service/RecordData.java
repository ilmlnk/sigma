package collections.service;

import java.io.*;

public class RecordData {
    protected static final String FILE_DIRECTORY = "/home/ilmlnk/IdeaProjects/Level3/src/main/java/collections/files/";
    protected static final String FILE_LOCATION = "LINES";

    public static boolean recordCalculations(Object object) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_DIRECTORY + FILE_LOCATION)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            ExtractData.extractCalculations();
        } catch (IOException e) {
            System.err.println("It is not possible to record data into file!");
            return false;
        }
        return true;
    }
}
