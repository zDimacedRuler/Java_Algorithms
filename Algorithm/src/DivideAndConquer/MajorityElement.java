package DivideAndConquer;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMajor(arr);
    }

    private static void findMajor(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle = start + (end - start) / 2;
        int first = binaryFirst(arr, arr[middle]);
        int last = first + (arr.length / 2);
        if (arr[first] == arr[last])
            System.out.print(arr[middle]);
        else
            System.out.println("No majority element!!");
    }

    private static int binaryFirst(int arr[], int n) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == n)
                index = middle;
            if (n <= arr[middle]) {
                end = middle - 1;
            } else if (n > arr[middle]) {
                start = middle + 1;
            }
        }
        return index;
    }

}
