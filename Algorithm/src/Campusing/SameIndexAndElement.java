package Campusing;

public class SameIndexAndElement {
    public static void main(String[] args) {
        int arr[] = {-10, -9, 1, 2, 3, 5};
        int result = isSame(arr);
        if (result == -1)
            System.out.print("No same element found as Index!!");
        else
            System.out.print("The index and element is:" + result);
    }

    private static int isSame(int[] arr) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (arr[m] == m)
                index = m;
            if (arr[m] < m)
                start = m + 1;
            else if (arr[m] >= m)
                end = m - 1;
        }
        return index;
    }
}
