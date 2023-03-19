package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamTerminalOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 7);
        //a1 is result (initally identity)
        //a2 is list element
        BinaryOperator<Integer> b = (a1, a2) -> a1 * a2;

        //reduce() reduces the stream to one single value
        Integer result = list.stream().reduce(1, b);
        System.out.println(result);


        List<NewStudent> lst = StudentDataBase.getAllNewStudents();
        Optional<NewStudent> Student = lst.stream().reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2); // find the entry with largest GPA
        Optional<Integer> gradeLevelSum = Optional.of(lst.stream().map(o -> o.getGradeLevel()).reduce(1, Integer::sum)); // find the entry with largest GPA

        //max (s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
        //min (s1, s2) -> (s1.getGpa() < s2.getGpa()) ? s1 : s2);
        Optional<Integer> max = Optional.of(lst.stream().map(o -> o.getGradeLevel()).reduce(1, Integer::max)); // find the entry with largest GPA
        System.out.println(Student.get());
        System.out.println("GradeLevel :" + gradeLevelSum.get());
        System.out.println("max GradeLevel :" + max.get());

    }
}
