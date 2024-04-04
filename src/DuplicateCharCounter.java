import java.util.HashMap;

public class DuplicateCharCounter {
    public static void main(String[] args) {
        String str = "JavaJ2EE";
        countDuplicateCharacters(str);
    }

    public static void countDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to char array
        char[] strArray = str.toCharArray();

        // Iterate through the char array
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // If the character is already in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, put it in the map with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Iterate through the map and print the characters with counts greater than 1
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Char " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}