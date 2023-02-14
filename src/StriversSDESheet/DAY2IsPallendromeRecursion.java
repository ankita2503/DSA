package StriversSDESheet;

public class DAY2IsPallendromeRecursion {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
       // s = s.replaceAll("[^A-Za-z\\d]+", "").toLowerCase();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z\\d]+", "").toLowerCase();
        return checkPalindrome(str);
    }

    public static boolean checkPalindrome(String s) {
        if (s.length()-1 == 0) {
            return true;
        }
        char startChar = s.charAt(0);
        char endChar = s.charAt(s.length() - 1);
        if (startChar != endChar) {
            return false;
        }
        return checkPalindrome(s.substring(1, s.length() - 1));
    }

}

