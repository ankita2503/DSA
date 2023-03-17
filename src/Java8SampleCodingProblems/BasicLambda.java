package Java8SampleCodingProblems;

public class BasicLambda{

    public static void main(String[] args) {
        Runnable run = ()-> System.out.println("This is run from lambda");

        new Thread(run).start();
    }
}
