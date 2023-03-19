package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPITerminalOperations {

    public static void main(String[] args) {

        //joining() : performs String concatenation on the elements in the stream,
        // Returns a Collector that concatenates the input elements, separated by the specified delimiter, with the specified prefix and suffix, in encounter order.
        List<NewStudent> list = StudentDataBase.getAllNewStudents();
        String result = list.stream().map(NewStudent::getName).collect(Collectors.joining());
        System.out.println(result);
        String result1 = list.stream().map(NewStudent::getName).collect(Collectors.joining(","));
        System.out.println(result1);
        String result2 = list.stream().map(NewStudent::getName).collect(Collectors.joining(",", "(", ")"));
        System.out.println(result2);

        //Counting()
        //Reurns a Collector accepting elements of type T that counts the number of input elements. If no elements are present, the result is 0.
        long c = list.stream().filter(i -> i.getGpa() >= 4).collect(Collectors.counting());
        System.out.println("Total Number of elemets : " + c);

        //mapping() : Adapts a Collector accepting elements of type U to one accepting elements of type T by applying a mapping function to each input element before accumulation.
        List<String> studentList = list.stream().collect(Collectors.mapping(NewStudent::getName, Collectors.toList()));
        studentList.forEach(System.out::println);

        //minBy() : Returns a Collector that produces the minimal element according to a given Comparator, described as an Optional<T>.
        Optional<NewStudent> student = list.stream().collect(Collectors.minBy(Comparator.comparing(NewStudent::getGpa)));
        System.out.println(student.get());

        //maxBy() : Returns a Collector that produces the maximal element according to a given Comparator, described as an Optional<T>.
        Optional<NewStudent> studentMax = list.stream().collect(Collectors.maxBy(Comparator.comparing(NewStudent::getGpa)));
        System.out.println(studentMax.get());

        //summingInt() : Returns a Collector that produces the sum of a integer-valued function applied to the input elements. If no elements are present, the result is 0.
        int sum = list.stream().collect(Collectors.summingInt(NewStudent::getGradeLevel));
        System.out.println("Sum :" + sum);

        Double average = list.stream().collect(Collectors.averagingInt(NewStudent::getGradeLevel));
        System.out.println("Average :" + average);

    }
}
