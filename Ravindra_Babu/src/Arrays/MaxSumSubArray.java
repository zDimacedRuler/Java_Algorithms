package Arrays;
import java.util.Scanner;

/*
 * Maximum sum of a sub array in an array*/

public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        //The algorithm
        int max_sum = Integer.MIN_VALUE;
        int a, b, s;
        a = b = s = 0;
        for (int i = 1; i < length; i++) {
            if (arr[i - 1] > 0) {
                arr[i] += arr[i - 1];
                s++;
            } else {
                s = 0;
            }
            if (max_sum < arr[i]) {
                max_sum = arr[i];
                a = s;
                b = i;
            }
        }
        System.out.println("The a:" + a + " b:" + b);
        System.out.println("The max sum is:" + max_sum);
        scan.close();
    }
}
