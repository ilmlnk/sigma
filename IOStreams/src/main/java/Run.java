import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        FileProcessor fp = new FileProcessor("1.txt", "2.txt", "3.txt");
        Parser p = new Parser(fp);
        System.out.println("Execution result: " + fp.createRecording(10, 1));
        System.out.println(p.parseDoubles());
        System.out.println(p.parseStrings());
    }
}
