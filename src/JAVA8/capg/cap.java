package JAVA8.capg;

import java.util.HashMap;
import java.util.Hashtable;

public class cap {



    public static void main(String[] args) {
        String str = "aabbbeeeeffggg";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        map.entrySet().stream().forEach(entry->
        {
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        });
    }
}
