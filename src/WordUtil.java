import java.util.*;

public class WordUtil {

    public static Map<String, Integer> getWordMap(final String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();

        if (sentence == null || sentence.trim().isBlank()) {
            return wordMap;
        }

        final String[] wordsArray = sentence.split(" ");

        for (String word : wordsArray) {
            wordMap.putIfAbsent(word, 0);

            wordMap.put(word, wordMap.get(word) + 1);
        }

        return getSortedMap(wordMap);
    }

    private static Map<String, Integer> getSortedMap(Map<String, Integer> wordMap) {
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        wordMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        return sortedMap;
    }
}
