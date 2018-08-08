public class NthFibonacci {
    public static void main(String[] args) {
        System.out.println(getNthFibo(16));
    }

    private static int getNthFibo(int n) {
        if (n<=1)
            return n;
        return getNthFibo(n-1)+ getNthFibo(n-2);
    }
}
