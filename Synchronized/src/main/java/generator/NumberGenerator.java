package generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class NumberGenerator {
    public static void generateNumbers() {
        String filePath = "C:\\Users\\ilmln\\IdeaProjects\\Synchronized\\src\\main\\java\\files";
        File[] files = {new File(filePath), new File(filePath), new File(filePath)};
        Random random = new Random();

        for (int i = 0; i < files.length; i++) {

                try (PrintWriter printWriter = new PrintWriter(new FileWriter(files[i] + File.separator + (i+1)))) {
                    for (int j = 0; j < random.nextInt(50, 200); j++) {
                        int k = random.nextInt(0, 2);
                        System.out.println(k);
                        if (k == 1) {
                            printWriter.println(String.format("%.2f", Math.random() * 100 + 1000).replace(",", "."));
                        } else {
                            printWriter.println(random.nextInt(100, 1000));
                        }
                }
                } catch (IOException e) {
                    e.printStackTrace();
            }
        }
    }
}
