package String;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aaabbbccccccaadddbb";
        System.out.print("Encoded String of " + str + " is:" + stringEncode(str));
    }

    private static String stringEncode(String str) {
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1))
                count++;
            else {
                builder.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return builder.toString();
    }
}
