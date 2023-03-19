package Java8SampleCodingProblems;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.zip.DeflaterOutputStream;

public class PredicateExample {
    //take input and return boolean.


    public static void main(String[] args) {
        //int i = 0;//not allowed

        Predicate<Integer> predicate = (i) -> {
            //int i = 0;//not allowed
            return (i % 2 == 0);
        };

        Predicate<Integer> predicate2 = (i) -> {
            return (i % 5 == 0);
        };

        System.out.println(predicate.and(predicate2).test(10)); // predicate Chaining
        System.out.println(predicate.or(predicate2).test(4)); // predicate Chaining
        System.out.println(predicate.or(predicate2).negate().test(1)); // predicate Chaining

        List<NewStudent> list = StudentDataBase.getAllNewStudents();

        Predicate<NewStudent> studentPredicate = (i) ->  i.getGpa()>=4.0;

        Predicate<NewStudent> studentPredicate2 = (i) -> {
            return i.getGradeLevel()>=3;
        };

        BiPredicate<Integer, Double> biStudentPredicate = (gradeLevel, gpa) -> {
            return (gradeLevel>1 && gpa>1);
        };

        Consumer<NewStudent> studentConsumer = (i) -> {
            System.out.print(i.getName()+","+i.getActivities());
            System.out.println();
        };

        list.stream().filter(studentPredicate.and(studentPredicate2)).forEach(studentConsumer);

        list.stream().filter(i->biStudentPredicate.test(i.getGradeLevel(),i.getGpa())).forEach(studentConsumer);
    }
}
