package Arrays;

public class Immuntable {

    public final String name;

    public Immuntable(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public static void main(String [] args){

        Immuntable obj = new Immuntable("Ankita");

    }
}
