package Multithreading;

public class WaitAndNotifyDemo {

    public static final Object lock = new Object();

    public static void main(String[] args) {

        Thread one = new Thread(()->{
            try {
                one();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread two = new Thread(()->{
            try {
                Thread.sleep(100);
                two();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        one.start();
        two.start();
    }


    public static void one() throws InterruptedException {

        synchronized (lock){
            System.out.println("Hello from method one ...");
            lock.wait();
            System.out.println("Back again in method one");
        }
    }

    public static void two() throws InterruptedException {

        synchronized (lock){
            System.out.println("Hello from method two ...");
            lock.notify();
            System.out.println("Hello from method two even after notifying ...");
        }
    }
}
