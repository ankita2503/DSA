package Java8SampleCodingProblems.DefaultStaticMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class defaultMethod {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alex", "Bob", "michael", "harry", null);
        //list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        //Sort comparator with null values
        list.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).forEach(System.out::println);
        list.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).forEach(System.out::println);
    }
}
