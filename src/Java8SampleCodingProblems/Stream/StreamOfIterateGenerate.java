package Java8SampleCodingProblems.Stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerate {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println("OF");
        stream.forEach(System.out::print);
        System.out.println("ITERATE");
        Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);

        System.out.println("GENERATE");
        Supplier<Integer> supplier = new Random()::nextInt;

        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }
}
