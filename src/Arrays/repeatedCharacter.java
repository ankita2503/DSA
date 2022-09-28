package Arrays;

import java.util.HashMap;
import java.util.Map;

public class repeatedCharacter {

    public static void main(String[] args) {
        String s = "abccbaacz";
        char[] arr = s.toCharArray();
        int n = s.length();
        int i=0;
        Character ch = Character.MIN_VALUE;
        Map<Character,Integer> map = new HashMap();

        while(i<n){
            if(map.containsKey(arr[i])){
                ch = arr[i];
               break;
            } else {
                map.put(arr[i],1);
            }
        }

        System.out.println(ch);
    }
}
