package CoreJava;

public class Singleton {


    private String name;

    static Singleton singleSingleInstance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleSingleInstance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
