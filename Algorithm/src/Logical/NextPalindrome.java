package Logical;

import java.util.*;

public class NextPalindrome {
    public static void main(String[] args) {

//        int num[] = {3, 4, 7, 2, 2, 6, 4, 1};
//        int num[] = {9,9,9};
//        int num[] = { 1,2,2,1};
//        int num[] = { 1,2,5,3,2,2};
        int num[] = {1, 9, 9, 9, 6};
        if (isAll9(num)) {
            System.out.print("1");
            for (int i = 0; i < num.length - 1; i++)
                System.out.print("0");
            System.out.println("1");
            return;
        }
        if (is_Palindrome(num)) {
            num[num.length - 1]++;
        }
        for (int i = 0, j = num.length - 1; i < j; i++, j--) {
            if (num[i] >= num[j])
                num[j] = num[i];
            else {
                num[j - 1]++;
                int k = 1;
                while (num[j - k] == 10 && (j - k) > 0) {
                    num[j - k] = 0;
                    num[j - k - 1]++;
                    k++;
                }
                num[j] = num[i];
            }
            if (is_Palindrome(num))
                break;
        }
        System.out.println(Arrays.toString(num));
    }

    private static boolean is_Palindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j])
                return false;
        }
        return true;
    }

    private static boolean isAll9(int[] arr) {
        for (int anArr : arr) {
            if (anArr != 9)
                return false;
        }
        return true;
    }
}
