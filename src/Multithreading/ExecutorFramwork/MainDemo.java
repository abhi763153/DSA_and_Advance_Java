package Multithreading.ExecutorFramwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainDemo {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

//        Using ExecutorService

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i=0; i<10; i++){
            int finalI = i;
            executorService.submit(()->{
                System.out.println(factorial(finalI));
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        Thread[] threads = new Thread[10];
//        for (int i=0; i<10; i++){
//            int finalI = i;
//            threads[i] = new Thread(()->{
//                System.out.println(factorial(finalI));
//            });
//            threads[i].start();
//        }
//
//        for(Thread t: threads){
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        System.out.println("Time : "+ (System.currentTimeMillis() - startTime));
    }



    public static long factorial(int n)  {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
