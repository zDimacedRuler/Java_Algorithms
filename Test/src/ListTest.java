import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 3, 4, 5, 5, 6};
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(set.toArray()));

        //String
        String str = "aabcccdeefg";
        List<String> myList = Arrays.asList(str.split(""));
        Set<String> charList = new LinkedHashSet<>(myList);
        String joined = String.join("", charList);
        StringBuilder builder = new StringBuilder(joined);
        System.out.println(builder.reverse().toString());
    }
}
