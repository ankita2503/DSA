package Java8SampleCodingProblems;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionExample {

    public static Function<String,String> function = (name)->name.toUpperCase();
    public static Function<String,String> concatFunction = (name)->name.concat("default");

    public static void main(String[] args) {
        System.out.println(function.apply("Ankita"));
        System.out.println(function.andThen(concatFunction).apply("Ankita"));
        System.out.println(function.compose(concatFunction).apply("Ankita"));

        List<NewStudent> list = StudentDataBase.getAllNewStudents();

        Function<List<NewStudent>, Map<String,Double>> func = (l)->{
            Map<String,Double> map = new HashMap<>();
            list.forEach(i->map.put(i.getName(),i.getGpa()));
            return map;
        };

        System.out.println(func.apply(list));

        Predicate<NewStudent> studentPredicate2 = (i) -> {
            return i.getGradeLevel()>=3;
        };

        BiFunction<List<NewStudent>,Predicate<NewStudent>, Map<String,Double>> biFunc = (l1,p1)->{
            Map<String,Double> map = new HashMap<>();
            list.stream().filter(p1).forEach(i->map.put(i.getName(),i.getGpa()));
            return map;
        };

        System.out.println(biFunc.apply(list,studentPredicate2));




    }
}
