package HackerEarth;

import java.util.BitSet;
import java.util.Scanner;

public class BinaryQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        BitSet set = new BitSet();
        for (int i = 0; i < n; i++)
            if (scanner.nextInt() == 1)
                set.set(i);
        System.out.println(set);
        while (q > 0) {
            int queryType = scanner.nextInt();
            int index = scanner.nextInt();
            switch (queryType) {
                case 0:
                    System.out.print(set.previousSetBit(index-1) + " ");
                    System.out.println(set.nextSetBit(index+1));
                    break;
                case 1:
                    set.flip(index);
                    break;
            }
            q--;
        }
    }
}
