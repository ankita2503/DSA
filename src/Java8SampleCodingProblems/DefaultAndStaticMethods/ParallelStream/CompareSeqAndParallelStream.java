package Java8SampleCodingProblems.DefaultAndStaticMethods.ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class CompareSeqAndParallelStream {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        Supplier<Integer> supp1 = CompareSeqAndParallelStream::pSum;
        Supplier<Integer> supp2 = CompareSeqAndParallelStream::sum;

        System.out.println("Sequential Stream time : " + performanceCheck(supp2));
        System.out.println("parallel Stream time : " + performanceCheck(supp1));
    }

    public static int pSum() {
        return IntStream.range(1, 100000).parallel().sum();
    }

    public static int sum() {
        return IntStream.range(1000000, 2000000).sum();
    }

    public static long performanceCheck(Supplier<Integer> supplier) {
        long start = System.currentTimeMillis();
        supplier.get();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
