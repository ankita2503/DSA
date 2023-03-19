package Java8SampleCodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

public class Comparable {



    public static void main(String[] args) {

        Comparable.Student obj = new Student(1,"ankita",21);
        Comparable.Student obj2 = new Student(2,"ankita11",29);

        Comparable.Student obj3 = new Student(3,"ankita111",16);

        List<Student> list = new ArrayList<>();
        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(System.out::println);

    }

    public static class Student implements java.lang.Comparable<Student> {

        int rollNo;
        String name;
        int age;

        public Student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            return this.age-o.age;

        }
    }
}
