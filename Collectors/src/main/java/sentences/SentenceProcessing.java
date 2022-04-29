package sentences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SentenceProcessing {
    public static Map<Integer, Integer> subtractionVowelsAndConsonants(String text) {
        return text.chars().mapToObj(e -> (char) e).collect(HashMap::new,
                (m, c) -> {
            int countVowels = 0;
            int countConsonants = 0;
            int countFullStop = 0;

            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                if (Arrays.asList('a', 'e', 'i', 'o', 'u', 'y').contains(character)
                        && !Arrays.asList(' ', ',', '\n').contains(character)) countVowels++;
                if (!Arrays.asList('a', 'e', 'i', 'o', 'u', 'y').contains(character)
                        && !Arrays.asList(' ', ',', '\n').contains(character)) countConsonants++;

                if (Arrays.asList('.', '?', '!').contains(character)) {
                    countFullStop++;
                    int subtraction = countVowels - countConsonants;
                    if (subtraction < 0) subtraction *= -1;
                    m.put(countFullStop, subtraction);

                    countVowels = 0;
                    countConsonants = 0;
                }
            }
        }, HashMap::putAll);
    }
}
