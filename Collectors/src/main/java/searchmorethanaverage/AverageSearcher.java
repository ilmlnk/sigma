package searchmorethanaverage;

import java.util.*;

public class AverageSearcher {
    public static List<Integer> defineGreaterThanAverage(List<Integer> list) {
        Double avg = (double) list.stream().reduce(0, Integer::sum) / list.size();
        return list.stream()
                .filter(e -> e > avg)
                .toList();
    }
}