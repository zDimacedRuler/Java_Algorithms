import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int array[] = new int[length];
        System.out.println("Enter the array:");
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();
        mergeSort(array, 0, length - 1);
        showArray(array, array.length);
        scanner.close();
    }

    private static void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    private static void merge(int[] array, int p, int q, int r) {
        int leftLength = q + 2;
        int rightLength = r - q + 1;
        int left[] = new int[leftLength];
        int right[] = new int[rightLength];
        int index = 0, i, j;
        for (i = 0; i < leftLength - 1; i++) {
            left[i] = array[index++];
        }
        left[i] = Integer.MAX_VALUE;
        for (i = 0; i < rightLength - 1; i++) {
            right[i] = array[index++];
        }
        right[i] = Integer.MAX_VALUE;
        i = j = 0;
        for (int k = p; k <= r; k++) {
            if (left[i] <= right[j])
                array[k] = left[i++];
            else
                array[k] = right[j++];
        }
    }

    private static void showArray(int[] array, int length) {
        for (int i = 0; i < length; i++)
            System.out.print(array[i] + " ");
        System.out.println("");
    }
}
