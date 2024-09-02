public class Task6 {
    public static void main(String[] args) {
        String word = "DEMOCRACY";
        String come = word.substring(1,5);
        System.out.println(come);
        String reversed = new StringBuilder(come).reverse().toString();
        System.out.println(reversed);
    }
}
