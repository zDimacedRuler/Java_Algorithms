package Campusing;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldString;
        StringBuilder newString;
        oldString = scanner.next();
        newString = new StringBuilder();
        //algorithm
        int flag = 0;
        int length = oldString.length();
        for (int i = 0; i < length; i++) {
            char ch = oldString.charAt(i);
            if (checkVowel(ch)) {
                if (flag == 1) {
                    newString.append(ch);
                    continue;
                }
                if (i + 1 < length && checkVowel(oldString.charAt(i + 1))) {
                    flag = 1;
                    newString.append(ch);
                }
            } else {
                flag = 0;
                newString.append(ch);
            }
        }
        System.out.println(newString.toString());
    }

    public static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}
