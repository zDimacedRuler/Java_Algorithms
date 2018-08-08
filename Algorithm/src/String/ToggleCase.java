package String;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = toggle(str);
        System.out.println(str);
    }

    private static String toggle(String str) {
        StringBuilder builder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                builder.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                builder.append(Character.toUpperCase(ch));
            else
                builder.append(ch);
        }
        return builder.toString();
    }
}
