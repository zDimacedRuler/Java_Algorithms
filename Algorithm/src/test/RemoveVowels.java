package test;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldString, newString;
        oldString = scanner.next();
        newString = "";
        //algorithm
        int flag = 0;
        int length = oldString.length();
        for (int i = 0; i < length; i++) {
            char ch = oldString.charAt(i);
            if (checkVowel(ch)) {
                if (flag==1){
                    newString += ch;
                    continue;
                }
                if (i + 1 < length && checkVowel(oldString.charAt(i + 1))) {
                    flag = 1;
                    newString += ch;
                }
            }else{
                flag = 0;
                newString += ch;
            }
        }
        System.out.println(newString);
    }

    public static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
}
