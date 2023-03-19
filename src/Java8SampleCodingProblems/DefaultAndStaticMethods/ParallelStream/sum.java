package Java8SampleCodingProblems.DefaultAndStaticMethods.ParallelStream;

public class sum {
    private static int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void performSum(int input) {
        total += input;
    }
}
