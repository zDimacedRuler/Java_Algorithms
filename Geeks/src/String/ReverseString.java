package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Aman.kumar.das.is.my.name";
        String[] message = str.split("\\.");
        StringBuilder builder = new StringBuilder();
        for (int i = message.length - 1; i >= 0; i--) {
            if (i == 0)
                builder.append(message[i]);
            else
                builder.append(message[i] + ".");
        }
        System.out.println(str);
        System.out.println(builder.toString());
    }
}
