package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileCounter {
    private AtomicInteger counter = new AtomicInteger();

    public void increment(){
        counter.incrementAndGet();
    }

    public int getCouter(){
        return counter.get();
    }


    public static void main(String[] args) {

        VolatileCounter vc = new VolatileCounter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                vc.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                vc.increment();
            }
        });

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(vc.getCouter());
    }
}
