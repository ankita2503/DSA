package Arrays;

import java.io.Serializable;

public class Employee implements Serializable {
        public static final long serialVersionUID = 1234L;

        private long id;
        private String name;
        private transient String designation;

    public Employee(long id, String name, String designation) {
            this.id = id;
            this.name = name;
            this.designation = designation;
        }

        public String toString() {
            return String.format("%d - %s - %d", id, name, designation);
        }
    }
