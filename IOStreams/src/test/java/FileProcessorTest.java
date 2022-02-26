import org.junit.After;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

class FileProcessorTest {

    private File f1;
    private File f2;
    private File f3;

    private PrintWriter pw1;
    private PrintWriter pw2;
    private PrintWriter pw3;

    private FileReader fr1;
    private FileReader fr2;
    private FileReader fr3;

    private BufferedReader br1;
    private BufferedReader br2;
    private BufferedReader br3;

    private String nameTestFirst;
    private String nameTestSecond;
    private String nameTestThird;

    private final String[] bottles = {"Wine", "Juice", "Smoothie", "Water", "Alcohol", "Tea"};
    private final String[] materials = {"Glass", "Plastic", "Wood", "Metal"};

    @BeforeEach
    void setup() {

        this.nameTestFirst = "test1.txt";
        this.nameTestSecond = "test2.txt";
        this.nameTestThird = "test3.txt";

        f1 = new File(nameTestFirst);
        f2 = new File(nameTestSecond);
        f3 = new File(nameTestThird);

    }

    @Test
    void existingFiles() {
        Assertions.assertTrue(f1.exists());
        Assertions.assertTrue(f2.exists());
        Assertions.assertTrue(f3.exists());
    }

    @After
    public void endFileStream() {
        Assertions.assertTrue(f1.delete());
        Assertions.assertTrue(f2.delete());
        Assertions.assertTrue(f3.delete());
    }

    @Test
    void createRecording() {
        Random random = new Random();
        ArrayList<Product> testProductList = new ArrayList<>();

        try {
            pw1 = new PrintWriter(f1);
            pw2 = new PrintWriter(f2);
            pw3 = new PrintWriter(f3);
        } catch (FileNotFoundException e) {
            System.err.println("It is not possible to find these files!");
        }

        for (int i = 0; i < 10; i++) {

            String bottleTest = bottles[random.nextInt(bottles.length)];
            String materialTest =  materials[random.nextInt(materials.length)];
            double volumeTest = random.nextDouble(0.1, 2.0);

            Product testProduct = new Product(i+1, bottleTest, volumeTest, materialTest);

            Assertions.assertTrue(Arrays.asList(bottles).contains(bottleTest));
            Assertions.assertTrue(Arrays.asList(materials).contains(materialTest));
            Assertions.assertTrue(volumeTest >= 0.1 && volumeTest <= 2.0);

            testProductList.add(testProduct);
        }

        for (Product p : testProductList) {
            double checkVolume = p.getVolume();
            if (checkVolume <= 0.5) {
                pw1.println(p);
            } else if (checkVolume >= 0.51 && checkVolume <= 0.99) {
                pw2.println(p);
            } else {
                pw3.println(p);
            }
        }
        pw1.close();
        pw2.close();
        pw3.close();
    }

    @Test
    void testRecordedFiles() throws IOException {
        try {
            fr1 = new FileReader(f1);
            fr2 = new FileReader(f2);
            fr3 = new FileReader(f3);
        } catch (FileNotFoundException e) {
            System.err.println("It is not possible to find these files!");
        }

        br1 = new BufferedReader(fr1);
        br2 = new BufferedReader(fr2);
        br3 = new BufferedReader(fr3);

        String stringLoop;
        String[] splitString;

        while((stringLoop = br1.readLine()) != null) {
            splitString = stringLoop.split(" ");
            for (int i = 1; i < splitString.length; i+=2) {
                Assertions.assertNotNull(splitString[i]);
            }
        }
        while((stringLoop = br2.readLine()) != null) {
            splitString = stringLoop.split(" ");
            for (int i = 1; i < splitString.length; i+=2) {
                Assertions.assertNotNull(splitString[i]);
            }
        }
        while((stringLoop = br3.readLine()) != null) {
            splitString = stringLoop.split(" ");
            for (int i = 1; i < splitString.length; i+=2) {
                Assertions.assertNotNull(splitString[i]);
            }
        }
        try {
            br1.close();
            br2.close();
            br3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void sort() {
        List<Product> products = new ArrayList<>();
        List<Product> productsTest = new ArrayList<>();

        Product testProduct1 = new Product(1, "Alcohol", 1.89, "Glass");
        Product testProduct2 = new Product(2, "Wine", 1.09, "Plastic");
        Product testProduct3 = new Product(3, "Water", 1.14, "Wood");

        Assertions.assertTrue(products.add(testProduct1));
        Assertions.assertTrue(products.add(testProduct2));
        Assertions.assertTrue(products.add(testProduct3));

        Assertions.assertTrue(productsTest.add(testProduct1));
        Assertions.assertTrue(productsTest.add(testProduct2));
        Assertions.assertTrue(productsTest.add(testProduct3));


        Comparator<Product> comparator = Comparator.comparing(Product::getBottle)
                .thenComparing(Product::getVolume)
                .thenComparing(Product::getMaterial);
        productsTest.sort(comparator);

        Assertions.assertTrue(productsTest.containsAll(products));
    }


}