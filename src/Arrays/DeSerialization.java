package Arrays;

import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws IOException {
        String filePath = "EmployeeDetails.ser";
        try (
                FileInputStream fis = new FileInputStream(filePath);
                ObjectInputStream inputStream = new ObjectInputStream(fis);
        ) {
            Employee student = (Employee) inputStream.readObject();
            System.out.println(student);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}