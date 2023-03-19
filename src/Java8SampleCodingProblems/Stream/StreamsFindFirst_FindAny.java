package Java8SampleCodingProblems.Stream;

import Java8SampleCodingProblems.NewStudent;
import Java8SampleCodingProblems.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class StreamsFindFirst_FindAny {

    public static void main(String[] args) {
        //use to find an element in the stream. It is a kind of short circuiting operation.
        //findFirst() : Return first element in the stream
        //findAny() : Returns first encountered element in the stream
        List<NewStudent> list = StudentDataBase.getAllNewStudents();
        Optional<NewStudent> any = list.parallelStream().filter(i -> i.getGpa() >1).findAny();
        Optional<NewStudent> first = list.stream().filter(i -> i.getGpa() >1).findFirst();
        System.out.println(any);
        System.out.println(first);


    }
}
