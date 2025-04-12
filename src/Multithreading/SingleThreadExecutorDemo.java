package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private final int taskId;

    public Task(int taskId){
        this.taskId = taskId;
    }

    @Override
    public void run(){
        System.out.println("Task id: "+ taskId+ " being executed by thread "+ Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
public class SingleThreadExecutorDemo {

    public static void main(String[] args) {

        Long startTime = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {

            for (int i=0; i<5; i++){
                executorService.execute(new Task(i));
            }
        }

        System.out.println("Time takes: "+ (System.currentTimeMillis() - startTime));
    }
}
