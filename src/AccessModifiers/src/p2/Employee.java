package AccessModifiers.src.p2;

public class Employee {

    int id;

    int age;

    int name;

    public Employee(int id, int age, int name) {
        this();
        this.id = id;
        this.age = age;
        this.name = name;

    }

    public Employee() {

    }


    protected String print() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
