import java.util.Arrays;

public class Task6Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        // Using  Java  Code,  check  for  Anagrams  in  these  strings:
        // "Despite commuting at the peek hour, she was able to keep to time"

        char[] arr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "Despite commuting at the peek hour, she was able to keep to time";
        String str2 = "peek the to time able was she commuting Despite hour at";
        System.out.println(areAnagrams(str1, str2));
    }

}
