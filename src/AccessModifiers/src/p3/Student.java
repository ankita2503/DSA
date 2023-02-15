package AccessModifiers.src.p3;

public class Student {

    int id;

    String schoolname;

    String name;

    public Student(int id, String schoolname, String name) {
        this.id = id;
        this.schoolname = schoolname;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
