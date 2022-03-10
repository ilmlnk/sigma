import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {
        FileProcessor fp = new FileProcessor("1.txt", "2.txt", "3.txt");
        System.out.println("Execution result: " + fp.createRecording(10, 1));
        wrapper();
        System.out.println("Execution result: " + fp.createRecording(10, 2));
        wrapper();
        System.out.println("Execution result: " + fp.createRecording(10, 3));
        wrapper();
        System.out.println(p.parseDoubles());
        System.out.println(p.parseStrings());
    }

    public static void wrapper() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
