package SlidingWindowArrays;


import java.util.*;


public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList();
        HashMap<Character, Integer> map = new LinkedHashMap();
        HashMap<Character, Integer> resultMap = new LinkedHashMap();
        int start = 0;
        int end = 0;
        int k = p.length();
        for (int i = 0; i < p.length(); i++) {
            Character cha = p.charAt(i);
            if (resultMap.containsKey(cha)) {
                resultMap.put(cha, resultMap.get(cha) + 1);
            } else {
                resultMap.put(cha, 1);
            }
        }

        while (end < s.length()) {
            Character rem = s.charAt(end);
            if (map.containsKey(rem)) {
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }

            if (end - start + 1 == k) {
                Character c = s.charAt(end);
                if (areEqual(map, resultMap)) {
                    list.add(start);
                }

                Character remove = s.charAt(start);
                if (map.containsKey(remove) && map.get(remove) - 1 == 0) {
                    map.remove(remove);
                } else if (map.containsKey(remove) && map.get(remove) - 1 != 0) {
                    map.put(remove, map.get(remove) - 1);
                }

                start++;
            }
            end++;
        }
        return list;
    }

    private static boolean areEqual(Map<Character, Integer> first, Map<Character, Integer> second) {
        if (first.size() == 0 && second.size()==0) {
            return false;
        }
        if (first.size() != second.size()) {
            return false;
        }
        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "bb";

        List<Integer> list = findAnagrams(s, p);
        list.forEach(System.out::println);
    }

}
