package mapping;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ParallelMapping {
    public static Map<Integer, Integer> parallelCountOfEvens(Integer[] numbs, int sortType) {
        Map<Integer, Integer> preparedMap = Arrays.stream(numbs)
                .parallel()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        switch (sortType) {
            case 1 -> {
                System.out.println("Sorting By Key");
                return preparedMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors
                                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }

            case 2 -> {
                System.out.println("Sorting By Value");
                return preparedMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors
                                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }
        }
        return Collections.emptyMap();
    }

    public static Map<Integer, Integer> sequentialCountOfEvens(Integer[] numbs, int sortType) {
        Map<Integer, Integer> preparedMap = Arrays.stream(numbs)
                .sequential()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        switch (sortType) {
            case 1 -> {
                System.out.println("Sorting By Key");
                return preparedMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors
                                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }

            case 2 -> {
                System.out.println("Sorting By Value");
                return preparedMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors
                                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            }
        }
        return Collections.emptyMap();
    }
}
