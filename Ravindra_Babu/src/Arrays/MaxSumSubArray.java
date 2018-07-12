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
        maxSubArraySum(arr);
        kadane(arr, length);
        maxSumRavi(arr, length);
        scan.close();
    }

    /*
     * Simple observation: if the index is at i, then (currentSum + array[i]) will be the cuurentSum or
     * the current element arr[i] will only be the currentSum
     * And when this current sum is greater than maxSu it is maxSum
     * */
    private static void kadane(int[] arr, int length) {
        int maxSum = arr[0], currentSum = arr[0];
        int a = 0, b = 0;
        int l = 0, f = 0;
        for (int i = 1; i < length; i++) {
//            this simple is of two lines

//            currentSum = Math.max(arr[i], currentSum + arr[i]);
//            maxSum = Math.max(maxSum, currentSum);

//            or-- below algo to print the index of the subArray

            int temp = currentSum + arr[i];
            if (temp > arr[i]) {
                b++;
                currentSum = temp;
            } else {
                a = i;
                b = i;
                currentSum = arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                l = a;
                f = b;
            }
        }
        System.out.println("Kadane The max sum is:" + maxSum);
        System.out.println("The left index is:" + l);
        System.out.println("The right index is:" + f);
    }

    static void maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        System.out.println("Geek The max sum is:" + max_so_far);
    }

    private static void maxSumRavi(int[] arr, int length) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 1; i < length; i++) {
            if (arr[i - 1] > 0) {
                arr[i] += arr[i - 1];
            }
            if (max_sum < arr[i]) {
                max_sum = arr[i];
            }
        }
//        System.out.println("The a:" + a + " b:" + b);
        System.out.println("Babu The max sum is:" + max_sum);
    }
}
