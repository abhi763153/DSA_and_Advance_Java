package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i=1; i<=3; i++){

            final int taskId = i;
            executorService.submit(()->{
                try{
                    System.out.println("Task " + taskId + " started");
                    System.out.println("Task " + taskId + " executed by thread: "+ Thread.currentThread().getName());
                }catch (Exception e){
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();
    }
}
