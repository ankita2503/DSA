package Arrays;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String [] args) throws IOException {

    String filePath = "EmployeeDetails.ser";
    Employee employee = new Employee(7654, "John","Senior Accountant");

try (FileOutputStream fos = new FileOutputStream(filePath);ObjectOutputStream outputStream = new ObjectOutputStream(fos);) {

        try {
            outputStream.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
}