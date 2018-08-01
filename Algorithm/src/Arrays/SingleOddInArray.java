package Arrays;

import java.util.Scanner;

/*
 * Find the number occurring odd no. of times.
 * given only one element occurs odd no. of times*/

public class SingleOddInArray {
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
        int residue = arr[0];
        for (int i = 1; i < length; i++) {
            residue = residue ^ arr[i];
        }
        System.out.println("The number is:" + residue);
        scan.close();
    }
}
