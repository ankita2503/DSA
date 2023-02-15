package AccessModifiers.src.p1;

 public class person {

    int id;

    String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    String print() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
