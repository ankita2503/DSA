package SlidingWindowArrays;

public class LongestNiceSubString {

    public static void main(String[] args) {
        String s = "cChH";
        System.out.println(longestNiceSubString(s));
    }

    public static String longestNiceSubString(String s) {

        int sRes = 0;
        int eRes = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = 0;
        StringBuilder builder = new StringBuilder();
        while (end < n - 1) {
            end++;
            if (arr[end] == Character.toLowerCase(arr[start]) || arr[end] == Character.toUpperCase(arr[start])) {
                builder.append(String.valueOf(arr[start]));
                sRes = start;
                eRes = end;
            }
                start++;


        }
        if(sRes==eRes){
            return "";
        }
        return s.substring(sRes, eRes+1);
    }
}
