package Java8SampleCodingProblems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class UnaryOperatorFunctionalInterafce {
    //take input and return output of same type -- unary
    //take 2 inputs of same type and return output of same type -- Binary
    public static UnaryOperator<String> uniFunction = (name) -> name.toUpperCase();
    public static UnaryOperator<String> uniConcatFunction = (name) -> name.concat("default");

    public static BinaryOperator<String> biFunction = (name1,name2) -> name1.concat(name2);

    public static void main(String[] args) {
        System.out.println(uniFunction.apply("Ankita"));
        System.out.println(uniFunction.andThen(uniConcatFunction).apply("Ankita"));
        System.out.println(uniFunction.compose(uniConcatFunction).apply("Ankita"));
        System.out.println(biFunction.apply("Ankita ","Singh"));

        Comparator<Integer> compartor = (a, b)->a.compareTo(b);

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compartor);
        System.out.println(maxBy.apply(5,6));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(compartor);
        System.out.println(minBy.apply(5,6));
        //BinaryOperator.maxBy((Comparator<Integer> )(a, b)->a.compareTo(b));


    }
}
