package Logical;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int result = findGCD(x, y);
        System.out.println("The GCD is:" + result);
    }

    public static int findGCD(int a, int b) {
        if (a % b == 0)
            return b;
        int r = a % b;
        return findGCD(b, r);
    }
}
