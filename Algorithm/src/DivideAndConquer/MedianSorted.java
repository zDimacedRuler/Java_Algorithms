package DivideAndConquer;

import java.util.Scanner;

public class MedianSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n1];
        System.out.println("First array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Second array:");
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }
        int median = getMedianOfSortedArray(arr1, arr2, 0, n1 - 1, 0, n1 - 1);
        System.out.println(median);
    }

    private static int getMedianOfSortedArray(int[] arr1, int[] arr2, int start1, int end1, int start2, int end2) {
        int len = end1 - start1 + 1;
        if (len == 1)
            return (arr1[start1] + arr2[start2]) / 2;
        if (len == 2)
            return (Math.max(arr1[start1], arr2[start2]) + Math.min(arr1[end1], arr2[end2])) / 2;
        int m1 = calcMedian(arr1, start1, end1, len);
        int m2 = calcMedian(arr2, start2, end2, len);
        if (m1 == m2)
            return m1;
        if (m1 < m2) {
            return getMedianOfSortedArray(arr1, arr2, start1 + len / 2, end1, start2, end2 - len / 2);
        }
        return getMedianOfSortedArray(arr1, arr2, start1, end1 - len / 2, start2 + len / 2, end2);
    }

    private static int calcMedian(int[] arr, int start, int end, int len) {
        if (len % 2 == 0)
            return (arr[start + len / 2] + arr[start + len / 2 - 1]) / 2;
        return arr[start + len / 2];
    }
}
