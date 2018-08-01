package Arrays;

import java.util.Scanner;

public class LongestIncreasingSubSequence {
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
        findSequence(array);
    }

    private static void findSequence(int[] array) {
        int lis[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            lis[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j])
                    lis[i] = Math.max(lis[i], lis[j] + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int ele : lis) {
            System.out.print(ele + " ");
            max = Math.max(max, ele);
        }

        System.out.println("\nThe maximum increasing subsequence is:" + max);
    }
}
