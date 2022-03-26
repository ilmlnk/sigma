package serial.service;
import serial.dto.Plane;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializeProcess implements Serializable {
    protected static final String PATH = "/home/ilmlnk/IdeaProjects/Level3/src/main/java/serial/serialfiles";
    private static final String FILEPATH = "planeSerialize";

    public static boolean serialize(ArrayList<Plane> planeList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH + FILEPATH))){
            for (Plane p : planeList) {
                oos.writeObject(p);
            }
            DeSerializeProcess.deserialize();
        } catch (IOException e) {
            System.err.println("It is not possible to perform serialization!");
            return false;
        }
        return true;
    }
}
