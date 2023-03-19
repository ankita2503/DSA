package Java8SampleCodingProblems;

import java.util.function.Consumer;

public class LocalVarInLambda {

    static int valueInLambda = 4;
    public static void main(String[] args) {
        int value = 4;

        Consumer<Integer> c1 = (i)->{
           // value++; Variable used in lambda expression should be final or effectively final or make it static or class variable
            valueInLambda++; //allowed
            System.out.println(i+value+valueInLambda);
        };

        c1.accept(4);


    }
}
