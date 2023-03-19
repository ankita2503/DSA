package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;

public class StreamAPITerminalPartitioningBy {

    public static void main(String[] args) {

        //partioningBy() : accepts a predicate() as input and returns map as output with key as true oand false
        List<NewStudent> list = StudentDataBase.getAllNewStudents();
        System.out.println("1st level Partitioning");
        partitionStudentByGPA();
        System.out.println("2nd Partitioning");
        partitionStudentByGPA_2();
    }

     public static void partitionStudentByGPA() {
        Map<Boolean, List<NewStudent>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.partitioningBy(i->i.getGpa()>3.8));
        map.entrySet().forEach(i -> System.out.println("Key :" + i.getKey() + "," + "Value" + i.getValue()));
    }

    public static void partitionStudentByGPA_2() {
        Map<Boolean, Set<NewStudent>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.partitioningBy(i->i.getGpa()>3.8, Collectors.toSet()));
        map.entrySet().forEach(i -> System.out.println("Key :" + i.getKey() + "," + "Value" + i.getValue()));
    }


}
