package Multithreading;

public class ThreadMain {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello World");

        Thread thread1 = new Thread(task);

        thread1.start();


    }
}
