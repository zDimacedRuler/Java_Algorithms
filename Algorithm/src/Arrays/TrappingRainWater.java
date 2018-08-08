package Arrays;

import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        //algorithm
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int water = 0;
        for (int i = 1; i < n; i++) {
            water += (Math.min(left[i], right[i]) - arr[i]);
        }
        System.out.println(water);
    }
}
