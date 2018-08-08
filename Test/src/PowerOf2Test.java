public class PowerOf2Test {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(17));
    }

    private static boolean isPowerOfTwo(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }
}
