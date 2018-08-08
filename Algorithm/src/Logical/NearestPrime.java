package Logical;

import java.util.ArrayList;
import java.util.Scanner;

public class NearestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> primes = PrintAllPrimes.sieve(100);
        int nearest = NearestBinarySearch(primes, n);
        System.out.println(nearest);
    }

    private static int NearestBinarySearch(ArrayList<Integer> primes, int n) {
        int left = 0, right = primes.size() - 1;
        int nearestPrime = -1;
        int diff = Integer.MAX_VALUE;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (primes.get(middle) <= n && diff > Math.abs(primes.get(middle) - n)) {
                nearestPrime = primes.get(middle);
                diff = Math.abs(primes.get(middle) - n);
            }
            if (diff == 0)
                return n;
            if (primes.get(middle) > n)
                right = middle - 1;
            else if (primes.get(middle) < n)
                left = middle + 1;
        }
        return nearestPrime;
    }
}
