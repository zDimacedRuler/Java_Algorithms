package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayGroup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int size = scan.nextInt();
        int count = -1;
        while (count < size) {
            ReverseArray.reverseArrayRecursion(arr, count + 1, count + size);
            count = count + size;
        }
        System.out.println(Arrays.toString(arr));

    }
}
