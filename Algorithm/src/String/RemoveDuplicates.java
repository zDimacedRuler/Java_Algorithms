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
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new LinkedHashSet<>(list);
        str = String.join("", set);
        return str;
    }
}
