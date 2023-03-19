package Java8SampleCodingProblems.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.*;

public class NumericStreams {

    class customObj {
        int id;
        String name;

        public customObj(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "customObj{" +
                    "id=" + id +
                    ", name=" + name +
                    '}';
        }
    }

    public static void main(String[] args) {

        //IntStream
        //LongStream
        //DoubleStream

        //Boxing : Convert primitive to wrapper
        //Unboxing : Convert wrapper to primitive

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(sumOfNNumbersUsingIntStream(10));
        System.out.println(sumOfNNumbersUsingLongStream(10));
        System.out.println(sumOfNNumbersUsingDoubleStream(10));
        System.out.println("Other Operations");
        otherOperationsOnNumbers();
        System.out.println("Change Stream type output Operations");
        new NumericStreams().chnageStreamType();
    }

    public static int sumOfNNumbers(List<Integer> integerList) {
        return integerList.stream().reduce(0, (x, y) -> x + y); //Unboxing to convert integer into int
    }

    public static List<Integer> boxing() {
        return IntStream.range(0, 10).boxed().collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public void chnageStreamType() {

        List<NumericStreams.customObj> list = IntStream.rangeClosed(1, 10).mapToObj(i -> {
            return new NumericStreams.customObj(i, "Ankita" + i);
        }).collect(Collectors.toList());

        list.forEach(System.out::println);

        long longSum = IntStream.rangeClosed(1, 10).mapToLong(Long::valueOf).sum();

        double doubleSum = IntStream.rangeClosed(1, 10).mapToDouble(Double::valueOf).sum();

        System.out.println("longSum" + longSum);
        System.out.println("doubleSum" + doubleSum);

    }

    public static void otherOperationsOnNumbers() {
        System.out.println("Count:" + IntStream.rangeClosed(1, 10).count());
        System.out.println("Average:" + IntStream.rangeClosed(1, 10).average().getAsDouble());
        System.out.println("Sum:" + IntStream.rangeClosed(1, 10).sum());
        System.out.println("Max:" + IntStream.rangeClosed(1, 10).max().getAsInt());
        System.out.println("Min:" + IntStream.rangeClosed(1, 10).min().getAsInt());
    }

    public static int sumOfNNumbersUsingIntStream(int n) {
        return IntStream.rangeClosed(1, 10).sum(); //includes starting and end in range
        //return IntStream.range(1,10).sum(); //excludes starting and end in range


    }

    public static long sumOfNNumbersUsingLongStream(int n) {
        return LongStream.rangeClosed(1, 10).sum(); //includes starting and end in range
        //return LongStream.range(1,10).sum(); //excludes starting and end in range
    }

    public static double sumOfNNumbersUsingDoubleStream(int n) {
        return IntStream.rangeClosed(1, 10).asDoubleStream().sum();

    }
}
