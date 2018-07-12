package Arrays;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix:");
        int length = scan.nextInt();
        int arr[][] = new int[length][length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
                arr[i][j] = scan.nextInt();
        showMatrix(arr);
        showSpiralMatrix(arr);
    }

    private static void showSpiralMatrix(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int k, l;
        k = l = 0;
        int i;
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    private static void showMatrix(int[][] arr) {
        for (int row[] : arr) {
            for (int ele : row)
                System.out.print(ele + " ");
            System.out.println();
        }
    }
}
