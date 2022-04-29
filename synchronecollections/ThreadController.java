package synchrocollections;

import synchrocollections.finder.Finder;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadController implements Runnable {

    private ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    private TreeSet<String> treeSet = new TreeSet<>();
    private String filePath;
    private File file;
    private Thread t;

    public ThreadController(String filePath) {
        this.filePath = filePath;
        this.file = new File(filePath);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String buffer = scanner.next();
                if (Finder.matchString(buffer)){
                    treeSet.add(buffer);
                    if (!concurrentHashMap.containsKey(buffer)) {
                        concurrentHashMap.put(buffer, 0);
                    }
                    concurrentHashMap.put(buffer, concurrentHashMap.get(buffer) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println(treeSet);
        }
        System.out.println(t.getName() + " " + concurrentHashMap);
    }
}
