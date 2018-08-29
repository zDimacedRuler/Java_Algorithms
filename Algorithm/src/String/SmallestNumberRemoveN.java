package String;

public class SmallestNumberRemoveN {
    public static void main(String[] args) {
        String str = "765028321";
        int n = 5;
        String res = "";
        res = buildSmallestNumber(str, n, res);
        System.out.println(res);
    }

    private static String buildSmallestNumber(String str, int n, String res) {
        if (n == 0) {
            res += str;
            return res;
        }
        if (str.length() <= n)
            return res;

        int minIndex = 0;
        for (int i = 1; i <= n; i++)
            if (str.charAt(i) < str.charAt(minIndex))
                minIndex = i;

        res += str.charAt(minIndex);
        str = str.substring(minIndex + 1, str.length());
        System.out.println(res + " " + str);
        return buildSmallestNumber(str, n - minIndex, res);
    }
}
