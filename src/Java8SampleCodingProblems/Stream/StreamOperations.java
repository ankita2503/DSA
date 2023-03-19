package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        List<NewStudent> list = StudentDataBase.getAllNewStudents();

        // map() transforms one type of stream to another stream.
        List<String> transformedList = list
                .stream()
                .map(NewStudent::getName)
                .map(String::toUpperCase)
                //.sorted(Comparator.comparing(NewStudent::getGpa))
                .collect(Collectors.toList());

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> l3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> l4 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<List<Integer>> IterList = new ArrayList<>();
        IterList.add(l1);
        IterList.add(l2);
        IterList.add(l3);
        IterList.add(l4);

        IterList.stream()
                .distinct()
              //.map(i->i)                  //Stream<List<Integer>
                .flatMap(List::stream)        //Stream<Integer>
                .collect(Collectors.toList())
                .forEach(System.out::print);

        IterList.stream()
                .distinct()
                //.map(i->i)                  //Stream<List<Integer>
                .flatMap(List::stream)        //Stream<Integer>
                .count();


        IterList.stream()
                //.map(i->i)                  //Stream<List<Integer>
                .flatMap(List::stream)      //Stream<Integer>
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                //.count()
                .forEach(System.out::print);

    }
}
