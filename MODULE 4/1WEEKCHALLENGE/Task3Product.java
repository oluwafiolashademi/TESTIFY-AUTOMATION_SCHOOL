public class Task3Product {
    public static int[] findMaxProduct(int[] num) {
        // Find two numbers of which the product is maximum in an array
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : num) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;
            }
        }
        return new int[]{max1, max2};
    }

    public static void main(String[] args) {
        int[] num = {1, 10, 2, 6, 5, 3};
        int[] result = findMaxProduct(num);
        System.out.println("Numbers: " + result[0] + ", " + result[1]);
    }
}
