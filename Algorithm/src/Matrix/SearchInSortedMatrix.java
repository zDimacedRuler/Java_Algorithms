package Matrix;

import java.util.Scanner;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element ot be searched:");
        int x = scanner.nextInt();
        matrixSearch(mat, x);
    }

    private static void matrixSearch(int[][] mat, int x) {
        int row = mat.length;
        int col = mat[0].length;
        int i = 0, j = col - 1;
        while (i < row && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("The index is:" + i + " " + j);
                return;
            } else if (mat[i][j] < x)
                i++;
            else if (mat[i][j] > x)
                j--;
        }
        System.out.print("Element " + x + " Not Found!!");
    }
}
