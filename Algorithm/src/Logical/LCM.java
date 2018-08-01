package Logical;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int result = findLCM(x, y);
        System.out.println("The GCD is:" + result);
    }

    public static int findLCM(int x, int y) {
        int gcd = GCD.findGCD(x, y);
        return x * y / gcd;
    }
}
