package Java8SampleCodingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefernce {

    //can be used where Lambda expression referring to a method directly.
    //if we are just referring to a different method in lambda, we can replace it with method reference

    //ClassName::methodName
    //ClassName::instanceMethodName
    //ClassName:: staticMethodName

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ankita","Singh");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("----");
        Supplier<List<NewStudent>> supplier = StudentDataBase::getAllNewStudents;
        Consumer<NewStudent> printListActivities = NewStudent::printListActivities;
        printListActivities.accept(supplier.get().get(0));

        //Constructor refernece
        Supplier<NewStudent> stude = NewStudent::new;
        NewStudent st = stude.get();

        Function<String,NewStudent> stude1 = NewStudent::new;
        NewStudent st1 = stude1.apply("name");

    }
}
