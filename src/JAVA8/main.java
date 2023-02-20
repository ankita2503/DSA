package JAVA8;

public class main {

    public static void main(String[] args) {
        ThreadingM t = new ThreadingM();
        Thread thread = new Thread(t);
        thread.start();

        Thread t2 = new Thread(()-> System.out.println("Thread from Lambda"));
        t2.start();
    }
}
