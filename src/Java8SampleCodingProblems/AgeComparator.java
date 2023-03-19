package Java8SampleCodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()==o2.getAge()){
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getAge()-o2.getAge();
        }

    }
}
