package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;

public class StreamAPITerminalGroupngBy {

    public static void main(String[] args) {

        //joining() : performs String concatenation on the elements in the stream,
        // Returns a Collector that concatenates the input elements, separated by the specified delimiter, with the specified prefix and suffix, in encounter order.
        List<NewStudent> list = StudentDataBase.getAllNewStudents();
        System.out.println("1st level Grouping");
        groupStudentByGender();
        customizedGroupStudentByGPA();
        System.out.println("2nd level Grouping");
        twoLevelgrouping();
        twoLevelgrouping_1();
        System.out.println("3rd level Grouping");
        threeLevelgrouping();
        System.out.println("Grouping with maxBy()");
        groupingBywithMaxBy();
        System.out.println("Grouping with maxBy() and CollectingAndThen Optional");
        groupingBywithMaxBy_2();


    }

    // groupingBy() : Returns a Collector implementing a "group by" operation on input elements of type T, grouping elements according to a classification function, and returning the results in a Map.
    public static void groupStudentByGender() {
        Map<String, List<NewStudent>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(NewStudent::getGender));
        map.entrySet().forEach(i -> System.out.println("Key :" + i.getKey() + "," + "Value" + i.getValue()));
    }

    public static void customizedGroupStudentByGPA() {
        Map<String, List<NewStudent>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(i -> i.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE"));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }

    public static void twoLevelgrouping() {
        Map<String, Map<String, List<NewStudent>>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(NewStudent::getGender,
                Collectors.groupingBy(i -> i.getGpa() > 3.8 ? "OUTSTANDING" : "AVERAGE")));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }

    public static void twoLevelgrouping_1() {
        Map<String, Double> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(NewStudent::getGender,
                Collectors.averagingInt(NewStudent::getGradeLevel)));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }

    public static void threeLevelgrouping() {
        Map<String, Double> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(NewStudent::getGender, LinkedHashMap::new,
                Collectors.averagingInt(NewStudent::getGradeLevel)));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }

    public static void groupingBywithMaxBy() {
        Map<Integer, Optional<NewStudent>> map = StudentDataBase.getAllNewStudents().stream().collect(Collectors.groupingBy(NewStudent::getGradeLevel, maxBy(Comparator.comparing(NewStudent::getGpa))));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }

    public static void groupingBywithMaxBy_2() {
        Map<Integer, NewStudent> map = StudentDataBase.getAllNewStudents().stream().collect(
                                                                      Collectors.groupingBy(NewStudent::getGradeLevel
                                                                    , Collectors.collectingAndThen(maxBy(Comparator.comparing(NewStudent::getGpa))
                                                                    , Optional::get)));
        map.entrySet().forEach(i -> System.out.println("Key : " + i.getKey() + ", " + "Value: " + i.getValue()));
    }
}
