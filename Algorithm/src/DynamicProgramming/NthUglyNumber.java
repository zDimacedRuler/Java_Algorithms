package DynamicProgramming;

public class NthUglyNumber {
    public static void main(String[] args) {
        int n = nthUgly(150);
        System.out.print(n);
    }

    private static int nthUgly(int n) {
        int ugly[] = new int[n];
        ugly[0] = 1;
        int i2, i3, i5;
        i2 = i3 = i5 = 0;
        for (int i = 1; i < n; i++) {
            int nextUgly = Math.min(ugly[i2] * 2, Math.min(ugly[i3] * 3, ugly[i5] * 5));
            ugly[i] = nextUgly;
            if (nextUgly == ugly[i2] * 2)
                i2++;
            if (nextUgly == ugly[i3] * 3)
                i3++;
            if (nextUgly == ugly[i5] * 5)
                i5++;
        }
        return ugly[n - 1];
    }
}
