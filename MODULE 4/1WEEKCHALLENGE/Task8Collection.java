import java.util.Arrays;

public class Task8Collection {
    // Given a collection of 1 million integers, all ranging between1 to 9,
    // sort them in Big O(n) time
    public static void countingSort(int[] arr) {
        int[] count = new int[10];
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 1, 9, 6, 5, 8, 7};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
