package JAVA8;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8Stream {

    public static void main(String[] args) throws IOException {
        List<Integer> list = List.of(8,2,3,4,5,6,7,1);

        list.stream().allMatch(i->i>2);

        Predicate<Integer> even = i->(i%2==0);

        BiPredicate<Integer,Integer> biPredicate = (s1,s2)->(s1<=s2);
        //list.stream().filter(even).forEach(System.out::println);

        Function<Integer,Integer> f = i->i*i;
        BiFunction<Integer,Integer,Integer> bf = (i1,i2)->i1*i2;
        Consumer<Integer> consumer = x->System.out.println(x);
        BiConsumer<Integer,Integer> biConsumer = (x1,x2)->System.out.println(x1+x2);
        Supplier<Integer> supplier = ()->Integer.MAX_VALUE;

        consumer.accept(supplier.get());
        list.stream().map(f).forEach(consumer);
        Optional<Integer> sumSquare = list.stream().map(f).reduce((t1,t2)->t1+t2);
        System.out.println("sq sum:"+sumSquare.get());
        BinaryOperator<Integer> binaryOpt = (s1, s2)-> s1+s2;
        //Optional<Integer> sum = list.stream().reduce(binaryOpt);
        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        System.out.println("sum:"+sum.get());

        list.stream().distinct().forEach(System.out::println);


        List<String> l = List.of("spring","springboot","api","aws","pcf","azure");

        l.stream().sorted(Comparator.comparing(i->i.length())).forEach(System.out::println);

        l.stream().limit(5).forEach(System.out::println); // first 5 data is displayed
        l.stream().skip(1).forEach(System.out::println);//skip 1st data
        list.stream().takeWhile(even).forEach(System.out::print);//take all the data from the time first even number is encountered, skip all the data before that.
        System.out.println();
        list.stream().dropWhile(even).forEach(System.out::print);//skip all the data from the time first even number is encountered, take all the data after that.
        Optional<Integer> s = list.stream().max(Comparator.comparing(i->i*i));
        list.stream().findFirst();
        list.stream().filter(even).mapToInt(i->(i*i)).sum();
        list.stream().filter(even).mapToInt(i->(i*i)).average();
        list.stream().filter(even).mapToInt(i->(i*i)).count();

        //l.stream().collect(Collectors.groupingBy()
        list.stream().findAny();

        list.stream().mapToInt(i->i).sum();

        list.stream().mapToInt(i->(i*i)).filter(s5->(s5>100)).average();

        list.stream().mapToInt(i->i).max();
        Stream.of(1,2,3,4).max(Comparator.comparing(Integer::valueOf)).get();
        //l.stream().filter(i->i.contains("spring")).forEach(System.out::println);

        int[] arr = {2,5,8,3,6,9,2,1};

        Arrays.stream(arr).sum();
        Arrays.stream(arr).min();
        Arrays.stream(arr).max();
        Arrays.stream(arr).average();

        // Create a Stream with first 10 natural numbers
        IntStream.range(1,10).sum(); // 10 is excluded

        IntStream.rangeClosed(1,10);


        IntStream.iterate(1,i->i+2).limit(10).peek(System.out::println).sum();

        IntStream.iterate(1,i->i+2).limit(10).boxed().collect(Collectors.toList());

        BigInteger result = LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply);
        System.out.println("Result:"+result);

        String str = l.stream().collect(Collectors.joining(","));
        System.out.println(str);

        List<List<String>> lst = Arrays.asList(Arrays.asList("Ankita","MOnica"),Arrays.asList("Raechel","Lisa"));
        List<String> p = lst.stream().flatMap(List::stream).collect(Collectors.toList());
        p.forEach(System.out::println);


        //List.of("spring","springboot","api","aws","pcf","azure");
        List<String[]> k = l.stream().map(q->q.split("")).collect(Collectors.toList());
        List<String> fl = k.stream().flatMap(Arrays::stream).collect(Collectors.toList());

        fl.forEach(System.out::print);

        Files.lines(Paths.get("StreamFile.txt"))
                .map(s2->s2.split(("")))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);


        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);


        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> stream = Stream.concat(list1.stream(),list2.stream());

        System.out.println("Stream Concat Start");
        stream.forEach(System.out::print);

        String newStr = " ankita ";
        System.out.println(newStr.strip());

        list.toArray(Integer[]::new);

        short b=(int)1;
        int y=2;
        System.out.println(b+y);

    }





}
