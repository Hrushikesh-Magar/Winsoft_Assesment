import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "This is a sample string with five words.";
        System.out.println("Number of words in the string: " + countWords(input));
    }

    public static int countWords(String input) {
        Map<Integer, String> wordMap = new HashMap<>();
        int count = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isWhitespace(c)) {
                if (!word.toString().isEmpty()) {
                    wordMap.put(count++, word.toString());
                    word = new StringBuilder();
                }
            } else {
                word.append(c);
            }
        }

        // Add the last word to the map
        if (!word.toString().isEmpty()) {
            wordMap.put(count++, word.toString());
        }

        return count;
    }
}