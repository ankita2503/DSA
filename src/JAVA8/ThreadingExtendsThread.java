package JAVA8;

public class ThreadingExtendsThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is created from Thread extend");
    }
}
