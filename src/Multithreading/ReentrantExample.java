package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        lock.lock();
        try{
            System.out.println("Inner Method");
            innerMethod();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {

        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outerMethod();
    }
}
