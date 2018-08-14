package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        sort(array, 0, length - 1);
        showArray(array, length);
        scanner.close();

    }

    public static void sort(int[] array, int p, int r) {
        if (p < r) {
            int q = partition(array, p, r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }
    }

    private static int partition(int[] array, int p, int r) {
        int i = p - 1;
        int key = array[r];
        for (int j = p; j <= r; j++) {
            if (array[j] <= key) {
                i += 1;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        return i;
    }

    private static void showArray(int[] array, int length) {
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
