package Logical;

import java.util.*;

public class PrintAllPrimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> array;
        array = sieve(n);
        System.out.println(Arrays.toString(array.toArray()));
    }

    public static ArrayList<Integer> sieve(int n) {
        int nNew = (n - 2) / 2;
        boolean marked[] = new boolean[nNew + 1];
        Arrays.fill(marked, false);

        for (int i = 1; i <= nNew; i++)
            for (int j = i; (i + j + 2 * i * j) <= nNew; j++)
                marked[i + j + 2 * i * j] = true;

        ArrayList<Integer> primes = new ArrayList<>();
        if (n >= 2)
            primes.add(2);
        for (int i = 1; i <= nNew; i++) {
            if (!marked[i])
                primes.add(2 * i + 1);
        }
        return primes;
    }
}
