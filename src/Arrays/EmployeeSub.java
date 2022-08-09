package Arrays;

import java.io.Serializable;

public class EmployeeSub extends Employee{
        public static final long serialVersionUID = 1234L;

        private long id;
        private String name;
        private transient String designation;



        public String toString() {
            return String.format("%d - %s - %d", id, name, designation);
        }


    public EmployeeSub(long id, String name, String designation) {
        super(id, name, designation);
    }
}
