package threads.dto;

import java.util.*;

public class TreeSetController {
    public static TreeSet<Character> sortCharacters(ArrayList<Character> punctuationList) {
        return new TreeSet<>(punctuationList);
    }
}
