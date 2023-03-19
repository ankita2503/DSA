package Java8SampleCodingProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierFunctionalInterafce {
    //Does not take any input and return an output.

    public static Supplier<NewStudent> supplier = () -> new NewStudent("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));

    public static Supplier<List<NewStudent>> listSupplier = () -> StudentDataBase.getAllNewStudents();

    public static void main(String[] args) {

        System.out.println(supplier.get());
        System.out.println(listSupplier.get());
    }
}
