package SetA1;

import java.util.Arrays;

public class SumSortArray3 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 8, 3, 15};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        Arrays.sort(arr);

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
