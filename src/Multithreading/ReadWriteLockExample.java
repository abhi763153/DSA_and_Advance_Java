package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    private int count = 0;

   private final ReadWriteLock lock = new ReentrantReadWriteLock();

   private final Lock readlock = lock.readLock();
   private final Lock writelock = lock.writeLock();

   public void increment(){
       writelock.lock();

       try {
           this.count++;
           Thread.sleep(50);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       } finally {
           writelock.unlock();
       }
   }

   public int getCount(){
       readlock.lock();

       try{
           return this.count;
       }
       finally {
           readlock.unlock();
       }
   }

    public static void main(String[] args) throws InterruptedException {

        ReadWriteLockExample counter = new ReadWriteLockExample();

       Runnable task1 = new Runnable() {
           @Override
           public void run() {
              for(int i=0; i<=10; i++){
                  System.out.println(Thread.currentThread().getName()+" Read: "+ counter.getCount());
              }
           }
       };

       Runnable task2 = new Runnable(){
           @Override
           public void run(){
               for(int i=0; i<=10; i++){
                   counter.increment();
                   System.out.println(Thread.currentThread().getName()+" Incremented ");
               }
           }
       };

       Thread writeThread = new Thread(task2, "Write Thread");
       Thread readThread1 = new Thread(task1, "Read Thread 1");
       Thread readThread2 = new Thread(task1, "Read Thread 2");

       writeThread.start();
       readThread1.start();
       readThread2.start();

        writeThread.join();
        readThread1.join();
        readThread2.join();

        System.out.println("Final count - "+ counter.getCount());

    }
}
