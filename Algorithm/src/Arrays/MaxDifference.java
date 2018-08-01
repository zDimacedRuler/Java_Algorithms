package Arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * Max Difference between two elements
 * such that larger no. appears after smaller no.*/

public class MaxDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int arr[] = new int[length];
        arr = randomArrayGenerator(arr, length);
        System.out.println("The array is:");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
//		System.out.println("Enter the elements of the array:");
//		for(int i=0;i<length;i++){
//			arr[i]=scan.nextInt();
//		}

        //the algorithm
        int min_so_far = arr[0];
        int max_so_far = Integer.MIN_VALUE;
        int a, b;
        a = b = arr[0];
        for (int i = 1; i < length; i++) {
            if (min_so_far > arr[i])
                min_so_far = arr[i];
            if (arr[i] - min_so_far > max_so_far) {
                max_so_far = arr[i] - min_so_far;
                b = arr[i];
                a = min_so_far;
            }
        }
        System.out.println("The result " + b + " - " + a + " = " + max_so_far);
        scan.close();
    }

    public static int[] randomArrayGenerator(int[] arr, int length) {

        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }
}
