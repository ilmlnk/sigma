package controller;

import java.util.*;
import java.util.stream.Collectors;

public class StreamController {
    public static List<String> streamCapitalization(String text) {
        String[] words = text.split(" ");

        return Arrays.stream(words)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).replaceAll("[,.?!]", ""))
                .toList();
    }

    public static List<String> streamSortedSentences(String text) {
        String[] words = text.split("[,.!?]");

        return Arrays.stream(words)
                .map(s -> s.replaceAll("[,.?!]", "").replaceAll("^ ", ""))
                .sorted(Comparator.comparing(String::length))
                .toList();
    }

    public static Map<Boolean, List<Integer>> streamSeparatedNumbers(ArrayList<Integer> integers) {
        return integers.stream()
                .filter(x -> x != 0)
                .collect(Collectors.partitioningBy(x -> x > 0));
    }
}
