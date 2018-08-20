package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 789456;
        System.out.println(num);
        num = reverseRec(num);
        System.out.println(num);
    }

    private static int reverseRec(int num) {
        if (num <= 0)
            return 0;
        int r = num % 10;
        num = reverseRec(num / 10);
        num = addFirst(num, r);
        return num;
    }

    private static int addFirst(int num, int r) {
        if (num <=0)
            return r;
        else {
            int y = num % 10;
            num = addFirst(num/10, r);
            num = num * 10 + y;
            return num;
        }
    }
}
