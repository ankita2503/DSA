package Arrays;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class findDuplicatesFrom2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 10, 15, 35, 60, 80};
        int[] arr2 = {20, 35, 60, 75, 80};

        int i = 0, j = 0;

        List<Integer> list = new ArrayList<>();


        while (i < arr1.length || j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        list.forEach(System.out::println);

        List<List<Integer>> l = new ArrayList<>();

        List<Integer> nested = new ArrayList<>();

        nested.add(1);
        nested.add(2);
        nested.add(3);
        nested.add(4);
        nested.add(5);
        l.add(nested);




        System.out.println("***********");
        int min = nested.stream().collect(Collectors.minBy(Comparator.comparing(Integer::valueOf))).get();
        System.out.println("min" + min);

        int max = nested.stream().collect(Collectors.maxBy(Comparator.comparing(Integer::valueOf))).get();
        System.out.println("max" + max);

        System.out.println("***********");

        l.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(System.out::println);

        List<String> strList = new ArrayList<>();
        list.stream().map(String::valueOf).forEach(System.out::println);

        String str = "abc";
        Optional oStr = Optional.of(str);
        oStr.ifPresent(System.out::println);
        oStr.ifPresentOrElse(e -> {
            System.out.println("present");
        }, null);

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(1, "b");
        map.put(1, "c");
        map.put(1, "d");
        map.put(1, "e");


       List y = list.stream().flatMap(Stream::of).collect(Collectors.toList());

        map.entrySet().stream().forEach(i1 -> System.out.println(i1.getKey() + ":" + i1.getValue()));

        StringJoiner join = new StringJoiner(",", "[", "]");

        join.add("a");
        join.add("b");
        join.add("c");
        join.add("d");

        System.out.println(join.toString());


        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);



        List<String> stringList = new ArrayList<>();

        stringList.add("abc");
        stringList.add("abcd");
        stringList.add("abcfg");
        stringList.add("abcdwed");
        stringList.add("ab");


        System.out.println("****SORT START*****");
        stringList.stream().sorted().forEach(System.out::println);
        System.out.println("****SORT END*****");

        long  u = stringList.stream().filter(i5->i5.length()>3).count();

        stringList.stream().collect(Collectors.toSet());
        System.out.println(u);

        LocalDate.now();

        LocalDateTime.now();

        int sum = nested.stream().mapToInt(Integer::valueOf).sum();
        System.out.println("sum:" + sum);



        float f = 1.78932f;
        System.out.printf("%.2f",f);



    }
}
