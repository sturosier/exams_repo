import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = WordUtil.getWordMap("the cat is in the bag");

        for (String word : wordMap.keySet()) {
            System.out.printf("%d %s%n", wordMap.get(word), word);
        }
    }
}
