public class Task2Reverse {
    public static String reverseWords(String str) {
        // Reverse the position of words in "I am the best AutomationTester"
        if (str.isEmpty()) {
            return str;
        }
        String[] words = str.split(" ");
        return reverseWordsHelper(words, words.length - 1);
    }

    private static String reverseWordsHelper(String[] words, int index) {
        if (index < 0) {
            return "";
        }
        return words[index] + (index == 0 ? "" : " ") + reverseWordsHelper(words, index - 1);
    }

    public static void main(String[] args) {
        String input = "I am the best AutomationTester";
        System.out.println(reverseWords(input));
    }
}
