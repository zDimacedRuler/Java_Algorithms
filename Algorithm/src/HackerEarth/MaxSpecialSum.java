package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSpecialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        int arr[] = {-3, 2, 3, -4};
//        for (int i = 0; i < n; i++)
//            arr[i] = scanner.nextInt();
        printMaxSum(arr);
    }

    private static void printMaxSum(int[] arr) {
        int length = arr.length;
        //array to hold left sum of the array
        int[] leftSum = new int[length];
        //calculate left sum
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
            leftSum[i] = sum;
        }
        System.out.println(Arrays.toString(leftSum));

        //indexSum : sum that needs to be added to reach the last index
        //for a particular index
        int indexSum = 0;
        int index = 2;
        for (; indexSum + index < length; index++) {
            indexSum += index;
        }
        //last index
        index--;
        System.out.println(indexSum + ":" + index);
        int maxSpecialSum = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            int lastIndex;
            if (i + indexSum >= length) {
                indexSum -= index;
                index--;
            }
            lastIndex = i + indexSum;
            int specialSum = leftSum[lastIndex];
            if (i > 0)
                specialSum = specialSum - leftSum[i - 1];
            maxSpecialSum=Math.max(specialSum,maxSpecialSum);
            System.out.println(specialSum);
        }
        System.out.println("Max special sum is:"+maxSpecialSum);
    }
}
