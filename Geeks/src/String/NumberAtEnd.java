package String;

import java.util.*;

public class NumberAtEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(isNumberAtEnd(str));
    }

    private static boolean isNumberAtEnd(String str) {
        int length = str.length();
        int numLength = 0, num = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int val = str.charAt(i) - '0';
                num = num * 10 + val;
                numLength++;
            }
        }
        return length - numLength == num;
    }
}
