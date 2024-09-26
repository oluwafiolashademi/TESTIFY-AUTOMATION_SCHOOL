import java.util.*;

public class Task5Anagram {
    public static Map<String, List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            anagramMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        return anagramMap;
    }

    public static void main(String[] args) {
        String[] input = {"akka", "akak", "baab", "baba", "bbaa"};
        System.out.println(groupAnagrams(input));
    }
}
