package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestSumZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int leftIndex = 0;
        int rightIndex = length - 1;
        int currentSum, closestSum = Integer.MAX_VALUE;
        int l = leftIndex, r = rightIndex;
        while (leftIndex < rightIndex) {
            currentSum = arr[leftIndex] + arr[rightIndex];
            if (Math.abs(currentSum) < Math.abs(closestSum)) {
                closestSum = currentSum;
                l = leftIndex;
                r = rightIndex;
            }
            if (currentSum > 0)
                rightIndex--;
            else
                leftIndex++;
        }
        System.out.println("The closest sum is:" + closestSum);
        System.out.println("The elements are:" + arr[l] + "," + arr[r]);
    }
}
