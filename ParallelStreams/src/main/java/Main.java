import mapping.ParallelMapping;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] arr = new Integer[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        long startParallelTime = System.currentTimeMillis();
        System.out.println("Parallel Map : " + ParallelMapping.parallelCountOfEvens(arr, 2));
        System.out.println("Execution Time : " + (System.currentTimeMillis() - startParallelTime) + "ms");

        System.out.println("-".repeat(50));

        long startSequentialTime = System.currentTimeMillis();
        System.out.println("Sequential Map : " + ParallelMapping.sequentialCountOfEvens(arr, 2));
        System.out.println("Execution Time : " + (System.currentTimeMillis() - startSequentialTime) + "ms");
    }
}
