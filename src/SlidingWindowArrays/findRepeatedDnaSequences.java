package SlidingWindowArrays;

import java.util.*;

public class findRepeatedDnaSequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        int start = 0;
        int end = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        StringBuilder builder = new StringBuilder();
        List<String> list= new ArrayList();

        while(end<n){
            builder.append(arr[end]);

            if(end-start+1 == 10){
                list.add(builder.toString());
                builder.deleteCharAt(0);
                start++;
            }
            end++;
        }

        List<String> result = findDuplicates(list);

        result.stream().forEach(System.out::println);
    }

    public static List<String> findDuplicates(List<String> listContainingDuplicates) {
        final Set<String> setToReturn = new HashSet<>();
        final Set<String> set1 = new HashSet<>();
        for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        return new ArrayList<>(setToReturn);
    }
    }




