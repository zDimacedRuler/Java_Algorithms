package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        System.out.println("Enter the sum you want to find:");
        int x = scanner.nextInt();
        findSum(array, x);
    }

    private static void findSum(int[] array, int x) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if(currentSum==x){
                System.out.println("The SubArray is found from index " + 0 + " to index " + i);
            }
            if (sumMap.containsKey(currentSum - x)) {
                int leftIndex = sumMap.get(currentSum - x)+1;
                System.out.println("The SubArray is found from index " + leftIndex + " to index " + i);
            }
            sumMap.put(currentSum, i);
        }
    }
}
