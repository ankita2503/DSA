package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsSkipAndLimit {

    public static void main(String[] args) {

        //limit(n) : limits the n numbers of elements to be processed in the stream.
        //skip(n) : skips the n numbers of elements from the stream.

        List<Integer> list = Arrays.asList(2,6,4,2,6,8);
        //2,2,4,6,6,8

        //find sum of 2 largest elements
        int sum = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(2).mapToInt(Integer::intValue).sum();
        Optional<Integer> sum1 = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(2).reduce(Integer::sum);

        //find sum of all elements except first 3 smallest numbers largest elements
        Optional<Integer> sum3 = list.stream().sorted(Comparator.comparing(Integer::intValue)).skip(3).reduce(Integer::sum);
        System.out.println(sum);
        System.out.println(sum1.get());
        System.out.println(sum3.get());
    }
}
