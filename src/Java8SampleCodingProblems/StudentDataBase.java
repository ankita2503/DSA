package Java8SampleCodingProblems;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    /**
     * Total of 6 NewStudents in the database.
     * @return
     */
    public static List<NewStudent> getAllNewStudents(){

        /**
         * 2nd grade NewStudents
         */
        NewStudent NewStudent1 = new NewStudent("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        NewStudent NewStudent2 = new NewStudent("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade NewStudents
         */
        NewStudent NewStudent3 = new NewStudent("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        NewStudent NewStudent4 = new NewStudent("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade NewStudents
         */
        NewStudent NewStudent5 = new NewStudent("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        NewStudent NewStudent6 = new NewStudent("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<NewStudent> NewStudents = Arrays.asList(NewStudent1,NewStudent2,NewStudent3,NewStudent4,NewStudent5,NewStudent6);
        return NewStudents;
    }
}
