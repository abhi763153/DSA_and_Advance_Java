package Multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

     private final Lock lock = new ReentrantLock();

    private int balance = 1000;

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            if(balance >= amount){

                try {
                    this.balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawal");
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName() + " Withdrawal completed! Remaining balance :  "+ this.balance);
                }
                catch (Exception e){
                    Thread.currentThread().interrupt();
                }
                finally {
                    lock.unlock();
                }
            }
            else {
                System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
            }
        }
        else {
            System.out.println(Thread.currentThread().getName() + " Lock has already been accuired by another thread");
        }


    }
}
