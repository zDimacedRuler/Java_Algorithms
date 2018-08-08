package Logical;

import java.util.*;

public class DynamicFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        printFibonacci(arr, n - 1);
    }

    private static int printFibonacci(int[] arr, int i) {
        if (i == arr.length - 1)
            System.out.print("0 1 ");
        if (arr[i] != -1) {
            return arr[i];
        } else {
            int a = printFibonacci(arr, i - 2);
            int b = printFibonacci(arr, i - 1);
            arr[i] = a + b;
            System.out.print(arr[i] + " ");
            return arr[i];
        }
    }
}
