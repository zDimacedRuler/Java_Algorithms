import java.util.*;

public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println(primeFactors(120));
        primeFactorsGeeks(120);
    }

    private static Set<Integer> primeFactors(int i) {
        Set<Integer> set = new LinkedHashSet<>();
        while (i % 2 == 0) {
            set.add(2);
            i /= 2;
        }
        for (int j = 3; j <= Math.sqrt(i); j += 2) {
            while (i % j == 0) {
                set.add(j);
                i /= j;
            }
        }
        if (i > 2)
            set.add(i);
        return set;
    }

    public static void primeFactorsGeeks(int n) {
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
    }
}