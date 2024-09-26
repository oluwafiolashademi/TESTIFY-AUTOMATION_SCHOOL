public class Task7Reverse {
    public static String reverse(String str) {
        // Reverse "TestifyAutomation" using recursion in Java
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "TestifyAutomation";
        System.out.println(reverse(input));
    }
}
