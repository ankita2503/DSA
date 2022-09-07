package Recursion;

import java.util.HashSet;
import java.util.Set;

public class uniquePowerSet {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        powerset("aab", 0, "");

        for(String str : set){
            System.out.println(str);
        }
    }



    public static void powerset(String input, int index, String output) {
        int n = input.length();
        if (input.length() == index) {
            //System.out.println(output);
            set.add(output);
            return;
        }
        powerset(input, index + 1, output + String.valueOf(input.charAt(index)));
        powerset(input, index + 1, output);
    }
}
