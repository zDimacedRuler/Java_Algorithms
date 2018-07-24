import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        sort(array, length);
        System.out.println("The sorted Array is:");
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        scanner.close();
    }

    public static void sort(int[] array, int length) {
        for (int j = 1; j < length; j++) {
            int i = j - 1;
            int key = array[j];
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i -= 1;
            }
            array[i + 1] = key;
        }
    }
}
