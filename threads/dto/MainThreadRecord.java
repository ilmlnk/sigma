package threads.dto;

import java.io.*;


public class MainThreadRecord {
    private static int countPunctuationMarks;
    private static final char[] PUNCTUATION_MARKS = {'.', ',', '-', '?', ':', ';'};
    private static int totalExecutionTime;

    public static void consistentRecord(String fileReadPath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReadPath))) {
            double startTime = System.currentTimeMillis();
            int symbol = bufferedReader.read();
            while (symbol != -1) {
                for (char c : PUNCTUATION_MARKS) {
                    if ((char) symbol == c) {
                        countPunctuationMarks++;
                    }
                }
                symbol = bufferedReader.read();
            }
            double executionTime = (System.currentTimeMillis() - startTime);
            totalExecutionTime += executionTime;
            System.out.println("Punctuation marks count: " + countPunctuationMarks);
            System.out.println("Execution time: " + totalExecutionTime + "ms");
        } catch (IOException e) {
            System.err.println("It is not possible to perform operations with files!");
        } finally {
            countPunctuationMarks = 0;
        }
    }
}
