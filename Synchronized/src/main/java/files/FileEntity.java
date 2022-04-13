package files;

public class FileEntity {
    private static double total;

    public void executeSum(double num) {
        total = total + num;
    }

    public double getTotal() {
        return total;
    }
}
