package Arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*Maximum of all subArrays of size k
 * */
public class Max_K_SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scan.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the window size:");
        int k = scan.nextInt();
        printMax(arr, k);
    }

    private static void printMax(int[] arr, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int i;
        /* An element is useful if it is in current window and is greater
         * than all other elements on RIGHT side of it in current window.
         * */
        for (i = 0; i < k; i++) {
            while (!queue.isEmpty() && arr[i] > arr[queue.peekLast()])
                queue.removeLast();
            queue.addLast(i);
        }
        System.out.println("The Max in window size " + k + " are:");
        while (i < arr.length) {
            System.out.print(arr[queue.peekFirst()] + " ");
            while (!queue.isEmpty() && queue.peekFirst() <= (i - k))
                queue.removeFirst();
            while (!queue.isEmpty() && arr[i] > arr[queue.peekLast()])
                queue.removeLast();
            queue.addLast(i);
            i++;
        }
        System.out.print(arr[queue.peekFirst()] + " ");
    }
}
