package String;

import java.util.*;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String anaStr = scanner.next();
        boolean result = isAnagram(str, anaStr);
        if (result)
            System.out.println("Both the strings are anagram");
        else
            System.out.println("Both the strings are not anagram!!!");
    }

    private static boolean isAnagram(String str, String anaStr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            else
                map.put(str.charAt(i), 1);
        }
        for (int i = 0; i < anaStr.length(); i++) {
            if (map.containsKey(anaStr.charAt(i))) {
                map.put(anaStr.charAt(i), map.get(anaStr.charAt(i)) - 1);
                if (map.get(anaStr.charAt(i)) == 0) {
                    map.remove(anaStr.charAt(i));
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
