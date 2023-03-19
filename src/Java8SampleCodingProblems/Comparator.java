package Java8SampleCodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {



    public static void main(String[] args) {

        Student obj = new Student(1,"bnkita",21);
        Student obj2 = new Student(1,"ankita11",21);

        Student obj3 = new Student(3,"ankita111",78);

        List<Student> list = new ArrayList<>();
        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        //Collections.sort(list, new AgeComparator());
        Collections.sort(list, (o1,o2)->{
            if(o1.getAge()==o2.getAge()){
                return o1.getName().compareTo(o2.getName());
            }
            else return o1.getAge()-o2.getAge();
        });

        Collections.sort(list, java.util.Comparator.comparing(Student::getName).thenComparing(Student::getAge).reversed());


        //Collections.sort(list, new RollNumberComparator());
        list.forEach(e->System.out.println(e.toString()));


    }
}
