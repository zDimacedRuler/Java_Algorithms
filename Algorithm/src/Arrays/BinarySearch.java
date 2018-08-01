package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the value to be searched:");
        int k = scan.nextInt();
        int result = search(arr, 0, arr.length - 1, k);
        if (result != -1)
            System.out.println("The value " + k + " is found in " + (result + 1) + " position");
        else
            System.out.println("The value " + k + " is not found!!!");
    }

    private static int search(int[] arr, int start, int end, int searched) {
//        int middle = start + ((end - start) / 2);
        // faster and more clear alternative with zero fill right shift operator
        int middle = (start + end) >>> 1;
        if (start <= end) {
            if (arr[middle] == searched)
                return middle;
            else if (arr[middle] > searched)
                return search(arr, start, middle - 1, searched);
            else if (arr[middle] < searched)
                return search(arr, middle + 1, end, searched);
        }
        return -1;
    }
}
