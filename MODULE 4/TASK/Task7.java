import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //create a two dimensional array with 4 rows and 3 columns.
        // Fill only the first column with any fruits of ur choice
        String [][] fruits = new String [4][3];
        fruits [0][0] = "Mango";
        fruits [1][0] = "Apple";
        fruits [2][0] = "Guava";
        fruits [3][0] = "Banana";

        System.out.println(Arrays.deepToString(fruits));

    }
}
