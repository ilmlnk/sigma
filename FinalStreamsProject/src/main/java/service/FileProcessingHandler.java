package service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;


public class FileProcessingHandler implements Runnable {

    private long totalWordLength;
    private double averageWordLength;
    private long wordCount;
    private List<Path> filePaths;
    private File file;
    private String path;
    private Thread thread;

    public FileProcessingHandler(String path) {
        this.path = path;
        collectFilePaths(path);
        for (Path filePath : filePaths)
            new FileProcessingHandler(filePath.toFile());
    }

    public FileProcessingHandler(File file) {
        this.file = file;
        this.wordCount = 0L;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        try (Scanner scanner = new Scanner(Paths.get(file.toURI()))) {
            wordCount = scanner
                    .findAll("\\s+")
                    .map(MatchResult::group)
                    .count();

        } catch (IOException | NullPointerException e) {
            System.out.println("No files left for processing in directory!");
        }

        try (Stream<String> streamCountWordLength = Files.lines(Paths.get(file.toURI()))) {
            totalWordLength = streamCountWordLength
                    .flatMap(letter -> Arrays.stream(letter.split("")))
                    .count();
        } catch (IOException | NullPointerException e) {
            System.out.println("No files left for processing in directory!");
        }

        countAverageWordLength();
        output();
    }

    private void collectFilePaths(String path) {
        try (Stream<Path> paths = Files.walk(Paths.get(path))) {
            this.filePaths = paths
                    .parallel()
                    .filter(Files::isRegularFile)
                    .toList();
        } catch (IOException e) {
            System.err.println("It is not possible to perform operations with this directory!");
        }
    }

    private void output() {
        try {
            System.out.println("[File " + file.getName() + "] : Total word count : " + wordCount + " words");
            System.out.println("[File " + file.getName() + "] : Average word length : " +
                    averageWordLength);
        } catch (NullPointerException e) {
            System.out.println();
        }
    }

    private void countAverageWordLength() {
        averageWordLength = totalWordLength / (double) wordCount;
    }

    public long getTotalWordLength() {
        return totalWordLength;
    }

    public void setTotalWordLength(long totalWordLength) {
        this.totalWordLength = totalWordLength;
    }

    public double getAverageWordLength() {
        return averageWordLength;
    }

    public void setAverageWordLength(double averageWordLength) {
        this.averageWordLength = averageWordLength;
    }

    public long getWordCount() {
        return wordCount;
    }

    public void setWordCount(long wordCount) {
        this.wordCount = wordCount;
    }

    public List<Path> getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(List<Path> filePaths) {
        this.filePaths = filePaths;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public String toString() {
        return "FileProcessingHandler{" +
                "totalWordLength=" + totalWordLength +
                ", averageWordLength=" + averageWordLength +
                ", wordCount=" + wordCount +
                ", filePaths=" + filePaths +
                ", file=" + file +
                ", path='" + path + '\'' +
                ", thread=" + thread +
                '}';
    }
}