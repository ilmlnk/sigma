package threads.dto;

import java.io.*;
import java.util.*;

public class ThreadController implements Runnable {

    private static int countThread;
    private static final String FILE_WRITE_PATH = "C:\\Users\\ilmln\\IdeaProjects\\Level3\\src\\" +
            "main\\java\\threads\\files\\written\\writefile";
    private final char[] punctuationMarks = {'.', ',', '-', '?', ':', ';', '!'};

    private String fileReadPath;
    private int totalCountMarks;
    private Thread t;

    public ThreadController(String fileReadPath) {
        this.fileReadPath = fileReadPath;
        this.totalCountMarks = 0;
        countThread++;
        t = new Thread(this, String.valueOf(countThread));
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Working with Thread " + t.getName() + "...");
        ArrayList<Character> characters = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReadPath))) {
            double startTime = System.currentTimeMillis();
            FileWriter fileWriter = new FileWriter(FILE_WRITE_PATH + t.getName());
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                for (char c : punctuationMarks) {
                    if ((char) symbol == c) {
                        totalCountMarks++;
                        characters.add((char) symbol);
                    }
                }
                fileWriter.write((char) symbol);
                symbol = bufferedReader.read();
            }
            double executionTime = (System.currentTimeMillis() - startTime);
            System.out.println("Execution time on Thread " + t.getName() + ": " + executionTime + "ms");
            fileWriter.write("\nPunctuation marks count: " + totalCountMarks + "\n");
            fileWriter.write("Punctuation marks: " + TreeSetController.sortCharacters(characters) + "\n");
            fileWriter.write("Execution time: " + executionTime + "ms" + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("It is not possible to perform operations with files!");
        }
    }

    public String getFileReadPath() {
        return fileReadPath;
    }

    public void setFileReadPath(String fileReadPath) {
        this.fileReadPath = fileReadPath;
    }
}
