import java.io.File;
import java.util.Scanner;

public class Main {
    private static final String PATH_CHUNK = "/home/ilmlnk/IdeaProjects/Level3/src/files/";
    public static void main(String[] args) {
        File file1 = new File(PATH_CHUNK + "1");
        File file2 = new File(PATH_CHUNK + "2");
        File file3 = new File(PATH_CHUNK + "3");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length limit for strings : ");
        int limit = scanner.nextInt();

        File[] files = {file1, file2, file3};
        FileExtractor fileExtractor = new FileExtractor(files);
        System.out.println("Extraction result : " +
                ((fileExtractor.extractingData(limit)) ? "Success" : "Fail"));
    }
}
