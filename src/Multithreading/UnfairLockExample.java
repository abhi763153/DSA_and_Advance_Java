package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {

    private final Lock unfairLock = new ReentrantLock(true); // To make it fair, we have to pass true parameter.


    public void accessResource(){
        unfairLock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " Acquired the lock.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " Released the lock.");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {

        UnfairLockExample example = new UnfairLockExample();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };


        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

    }
}
