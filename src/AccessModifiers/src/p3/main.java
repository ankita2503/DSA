package AccessModifiers.src.p3;

import AccessModifiers.src.p2.Employee;

public class main extends Employee{

    public main(int id, int age, int name) {
        super();
    }

    public void main(String[] args) throws Throwable {
        Employee e1 = new Employee(1,1,1);
        this.print();
        finalize();
    }
}
