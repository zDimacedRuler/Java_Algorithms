import java.util.HashMap;
import java.util.LinkedHashMap;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aaaabbbbcddddeeeeefaaaa";
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else
                map.put(ch,1);
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : map.keySet()){
            builder.append(ch);
            builder.append(map.get(ch));
        }
        System.out.println(builder);
    }
}
