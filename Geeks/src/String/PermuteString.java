package String;

import java.util.*;

public class PermuteString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        permute(str, 0, str.length() - 1);
    }

    private static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int r) {
        char[] array = str.toCharArray();
        char temp = array[l];
        array[l] = array[r];
        array[r] = temp;
        return String.valueOf(array);
    }
}
