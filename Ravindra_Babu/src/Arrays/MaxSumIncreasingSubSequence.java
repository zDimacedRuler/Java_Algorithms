package Arrays;

import java.util.Scanner;

public class MaxSumIncreasingSubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        System.out.println("The Array is :");
        for (int ele : array)
            System.out.print(ele + " ");
        System.out.println();
        findMaxSum(array);
    }

    private static void findMaxSum(int[] array) {
        int lis[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            lis[i] = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + array[i]);
                }
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for (int ele : lis) {
            maxSum = Math.max(maxSum, ele);
            System.out.print(ele + " ");
        }
        System.out.println("\n The max sum increasing sub sequence is:" + maxSum);
    }
}

