package Multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadPriority {

    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.currentThread().getName() + " says hi!");



        Thread one = new Thread(() ->{
            for (int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName() + " says hi!");
            }
        });

        one.start();

    }
}
