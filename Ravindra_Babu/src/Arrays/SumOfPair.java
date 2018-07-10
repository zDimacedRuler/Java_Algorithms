package Arrays;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class SumOfPair {
    public static int naiveFindPair(int[] arr, int length, int x) {
        int pairs = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j && (arr[i] + arr[j]) == x) {
                    pairs++;
                }
            }
        }
        return pairs / 2;
    }

    public static int hashFindPair(int[] arr, int length, int x) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            int temp = x - arr[i];
            if (map.containsKey(temp))
                pairs++;
            map.put(arr[i], 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int[] arr = new int[length];
        arr = randomArrayGenerator(arr, length);
        System.out.println("The array is:");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
        System.out.println("Enter the desired sum:");
        int x = scan.nextInt();
        System.out.println("No. of pairs naive are:" + naiveFindPair(arr, length, x));
        System.out.println("No. of pairs hash are:" + hashFindPair(arr, length, x));
        scan.close();
    }

    public static int[] randomArrayGenerator(int[] arr, int length) {

        for (int i = 0; i < length; i++) {
            arr[i] = i;
        }
        Random rand = new Random();
        for (int i = 0; i < length / 2; i++) {
            int ran1 = rand.nextInt(length);
            int ran2 = rand.nextInt(length);
            int temp = arr[ran1];
            arr[ran1] = arr[ran2];
            arr[ran2] = temp;
        }
        return arr;
    }

}
