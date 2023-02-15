package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        Student s1 = new Student(3,"Ankita",12);
        Student s2 = new Student(1,"Ankita",13);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        Student s3 = new Student(2,"Cnkita",14);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list,new StudentIdComparator());
        list.stream().map(i-> i.getId()).forEach(System.out::println);

        Singleton obj = Singleton.getInstance();
        obj.setName("ankita");

       Singleton  obj2= Singleton.getInstance();
        obj2.setName("ankita2");

        System.out.println(obj.getName());
        System.out.println();
        System.out.println(obj2.getName());
    }
}
