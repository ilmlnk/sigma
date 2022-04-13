package atomic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Collectors;

public class AtomicFileController {
    private String folder = "C:\\Users\\ilmln\\IdeaProjects\\Synchronized\\src\\main\\java\\files";
    private List<Path> filesPath;

    DoubleAdder digit = new DoubleAdder();

    public double atomicCalculate() {
        /*try {
            filesPath = Files.walk(Paths.get(folder))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());

            for (Path filePath : filesPath) {
                File file = new File(String.valueOf(filePath));
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                digit.add(Double.parseDouble(bufferedReader.readLine()));
            }
            return digit.doubleValue();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }*/
    }
}
