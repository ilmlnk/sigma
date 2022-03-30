package collections.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecordData {
    private static final String FILE_DIRECTORY = "/home/ilmlnk/IdeaProjects/Level3/src/main/java/collections/files/";
    private static final String FILE_LOCATION = "LINES";

    public static boolean recordCalculations(String data) {
        File f1 = new File(FILE_DIRECTORY + FILE_LOCATION);
        try (FileWriter fileWriter = new FileWriter(f1, true)) {
            fileWriter.write(data + "\n");
        } catch (IOException e) {
            System.err.println("It is not possible to record data into file!");
        }
        return true;
    }
}
