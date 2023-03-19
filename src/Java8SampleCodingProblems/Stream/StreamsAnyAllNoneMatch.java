package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsAnyAllNoneMatch {

    public static void main(String[] args) {
        //takes in Predicate and return boolean
        List<NewStudent> list = StudentDataBase.getAllNewStudents();
        boolean anyMatch = list.stream().anyMatch(i -> i.getGpa() == 3.9);
        boolean allMatch = list.stream().allMatch(i -> i.getGpa() >= 1);
        boolean noneMatch = list.stream().noneMatch(i -> i.getGpa() == 100);
        System.out.println(anyMatch);
        System.out.println(allMatch);
        System.out.println(noneMatch);

    }
}
