package Multithreading.ExecutorFramwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newCachedThreadPool()) {

            for (int i=0; i<1000; i++){
                service.execute(new Work1(i));
            }
        }
    }
}

class Work1 implements Runnable{

    private final int workId;

    Work1(int workId) {
        this.workId = workId;
    }

    @Override
    public void run() {
        System.out.println("Task id: "+ workId + " is being executed by "+ Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
