package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<NewStudent> list = StudentDataBase.getAllNewStudents();

        System.out.println();

        //to debug the list stream operation, use the peek() method
        list.stream().peek((i-> {
            System.out.println(i);
        })).collect(Collectors.toList());


        System.out.println();
        Map<String,Double> map = list.stream().peek(i-> System.out.println(i)).collect(Collectors.toMap(NewStudent::getName,NewStudent::getGpa));

        map.entrySet().forEach(i-> System.out.println(i.getKey()+":"+i.getValue()));
    }
}
