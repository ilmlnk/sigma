import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class FileProcessor {

    private String nameFirst;
    private String nameSecond;
    private String nameThird;

    private File f1;
    private File f2;
    private File f3;

    private PrintWriter pw1;
    private PrintWriter pw2;
    private PrintWriter pw3;

    public FileProcessor(String nameFirst, String nameSecond, String nameThird) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.nameThird = nameThird;

        this.f1 = new File(nameFirst);
        this.f2 = new File(nameSecond);
        this.f3 = new File(nameThird);
    }

    public boolean createRecording(int n, int typeSort) {
        Random random = new Random();
        List<Product> productList = new ArrayList<>();
        try {
            pw1 = new PrintWriter(f1);
            pw2 = new PrintWriter(f2);
            pw3 = new PrintWriter(f3);
        } catch (FileNotFoundException e) {
            System.err.println("It is not possible to find these files!");
        }

        for (int i = 0; i < n; i++) {
            String bottle = createBottle();
            double volume = random.nextDouble(0.1, 2.0);
            String material = createMaterial();

            Product product = new Product(i+1, bottle, volume, material);
            productList.add(product);
        }
        sort(productList, typeSort);

        for (Product p : productList) {
            if (p.getVolume() <= 0.5) {
                pw1.println(p);
            }
            else if (p.getVolume() >= 0.51 && p.getVolume() <= 0.99) {
                pw2.println(p);
            }
            else {
                pw3.println(p);
            }
        }
        closeStreams();
        return true;
    }

    private String createBottle() {
        String[] bottles = {"Wine", "Juice", "Smoothie", "Water", "Alcohol", "Tea"};
        return bottles[(int) (Math.random() * bottles.length)];
    }

    private String createMaterial() {
        String[] materials = {"Glass", "Plastic", "Wood", "Metal"};
        return materials[(int) (Math.random() * materials.length)];
    }

    private boolean closeStreams() {
        pw1.close();
        pw2.close();
        pw3.close();
        return true;
    }

    public void sort(List<Product> products, int type) {
        switch (type) {
            case 1 -> {
                Comparator<Product> comparator = Comparator.comparing(Product::getBottle)
                        .thenComparing(Product::getVolume)
                        .thenComparing(Product::getMaterial);
                products.sort(comparator);
            }
            case 2 -> {
                Comparator<Product> comparator = Comparator.comparing(Product::getMaterial)
                        .thenComparing(Product::getVolume)
                        .thenComparing(Product::getBottle);
                products.sort(comparator);
            }
        }

        Comparator<Product> comparator = Comparator.comparing(Product::getVolume)
                .thenComparing(Product::getMaterial)
                .thenComparing(Product::getBottle);
        products.sort(comparator);
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    public void setNameSecond(String nameSecond) {
        this.nameSecond = nameSecond;
    }

    public String getNameThird() {
        return nameThird;
    }

    public void setNameThird(String nameThird) {
        this.nameThird = nameThird;
    }

    public File getF1() {
        return f1;
    }

    public void setF1(File f1) {
        this.f1 = f1;
    }

    public File getF2() {
        return f2;
    }

    public void setF2(File f2) {
        this.f2 = f2;
    }

    public File getF3() {
        return f3;
    }

    public void setF3(File f3) {
        this.f3 = f3;
    }

    public PrintWriter getPw1() {
        return pw1;
    }

    public void setPw1(PrintWriter pw1) {
        this.pw1 = pw1;
    }

    public PrintWriter getPw2() {
        return pw2;
    }

    public void setPw2(PrintWriter pw2) {
        this.pw2 = pw2;
    }

    public PrintWriter getPw3() {
        return pw3;
    }

    public void setPw3(PrintWriter pw3) {
        this.pw3 = pw3;
    }

}
