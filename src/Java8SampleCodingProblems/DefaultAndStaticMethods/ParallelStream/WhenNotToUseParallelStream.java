package Java8SampleCodingProblems.DefaultAndStaticMethods.ParallelStream;

import java.util.stream.IntStream;

public class WhenNotToUseParallelStream {

    public static void main(String[] args) {


        sum s = new sum();
        IntStream.rangeClosed(0, 1000).parallel().forEach(input -> sum.performSum(input));
        System.out.println("sum is:" + s.getTotal());
    }
}
