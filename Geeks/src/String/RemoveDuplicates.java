package String;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = removeDuplicates(str);
        System.out.println(str);
    }

    private static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        StringBuilder strBuilder = new StringBuilder();
        for (char ch : set) {
            strBuilder.append(ch);
        }
        str = strBuilder.toString();
        return str;
    }
}
