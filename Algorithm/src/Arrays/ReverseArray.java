package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        reverseArrayRecursion(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        int length = arr.length;
        for (int i = 0, end = length - 1; i < length / 2; i++, end--) {
            int temp = arr[end];
            arr[end] = arr[i];
            arr[i] = temp;
        }
    }

    public static void reverseArrayRecursion(int arr[], int left, int right) {
        if (left >= right)
            return;
        if (right >= arr.length)
            right = arr.length - 1;
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
        reverseArrayRecursion(arr, left + 1, right - 1);
    }
}
