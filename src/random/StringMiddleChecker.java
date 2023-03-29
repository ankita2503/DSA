package random;

public class StringMiddleChecker {

    public static void main(String[] args) {
        String str = "test";
        String mid = getStringBuilder(str);
        System.out.println(mid);
    }

    private static String getStringBuilder(String str) {
        int n = str.length();
        int mid = n/2;
        StringBuilder builder = new StringBuilder();
        builder.append((n % 2 == 0) ? str.charAt(mid-1) : "").append(str.charAt(mid));
        return builder.toString();
    }
}
