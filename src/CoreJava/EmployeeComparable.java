package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee s1 = new Employee(3,"Ankita",12);
        Employee s2 = new Employee(1,"Bnkita",13);
        Employee s3 = new Employee(2,"Cnkita",14);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list);

        list.stream().map(i->i.getId()).forEach(System.out::println);
    }
}
