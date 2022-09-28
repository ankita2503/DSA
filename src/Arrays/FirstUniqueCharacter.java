package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "loveleetcode";
        char[] arr = s.toCharArray();
        int[] bucket = new int[26];
        for(char c: s.toCharArray())
        {
            bucket[c - 'a']++;
        }

        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(bucket[ch - 'a']==1){
                System.out.println(i);
                break;
            }
        }


    }
}
