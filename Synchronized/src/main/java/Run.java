import atomic.AtomicFileController;
import files.FileEntity;
import threads.FileThreadController;

public class Run {
    public static void main(String[] args) {
        /*new FileThreadController("1");
        new FileThreadController("2");
        new FileThreadController("3");*/
        AtomicFileController atomicFileController = new AtomicFileController();
        System.out.println(atomicFileController.atomicCalculate());
    }
}