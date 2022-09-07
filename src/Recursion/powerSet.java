package Recursion;

public class powerSet {

    public static void main(String[] args) {
        powerset("abc", 0, "");
    }

    public static void powerset(String input, int index, String output) {
        int n = input.length();
        if (input.length()==index) {
            System.out.println(output);
            return;
        }
        powerset(input, index + 1, output + String.valueOf(input.charAt(index)));
        powerset(input, index + 1, output);
    }
}
