import java.io.*;
public class FileRecording {
    private static final String FILEPATH = "/home/ilmlnk/IdeaProjects/Level3/src/files/selected";
    private String recordData;

    public FileRecording() {}

    public String getRecordData() {
        return recordData;
    }

    public void setRecordData(String recordData) {
        this.recordData = recordData;
    }

    public static boolean fileRecord(String recordData) {
        try (FileWriter writer = new FileWriter(FILEPATH, true)) {
            writer.write(recordData + "\n");
        } catch (IOException e) {
            System.err.println("It is not possible to perform an operation with file!");
            return false;
        }
        return true;
    }
}
