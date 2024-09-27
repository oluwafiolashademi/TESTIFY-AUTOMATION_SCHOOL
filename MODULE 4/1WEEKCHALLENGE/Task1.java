public class Task1 {
    public static boolean isPalindrome(String str) {
        // Write  Java  code  to  check  if  racecar  and  10801  is  palindromes.
        String stripped = str.replaceAll("[a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(stripped).reverse();
        return stripped.equals(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("10801"));
    }
}
