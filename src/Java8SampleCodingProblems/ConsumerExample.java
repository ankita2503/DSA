package Java8SampleCodingProblems;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    //take input and return void.
    public static void main(String[] args) {
        Consumer<String> consumer = (s1) -> System.out.print(s1.toUpperCase());
        consumer.accept("I am in consumer lambda");

        //StudentDataBase StudentDB = new StudentDataBase();
        List<NewStudent> list = StudentDataBase.getAllNewStudents();

        Consumer<NewStudent> c1 = (s)->System.out.print(s.getName()+",");
        Consumer<NewStudent> c2 = (s)->System.out.print(s.getGender() +"   ::   ");

        list.forEach(c1.andThen(c2));//Consumer Chaining

        System.out.println();
        BiConsumer<Integer,Integer> biConsumerMultiple = (a,b)->System.out.println("Multiply Result is : "+ a*b);

        BiConsumer<Integer,Integer> biConsumerDivide = (a,b)->System.out.println("Division Result is : "+ a/b);
        biConsumerMultiple.andThen(biConsumerDivide).accept(10,5);
    }
}
