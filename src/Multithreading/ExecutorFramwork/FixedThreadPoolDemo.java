package Multithreading.ExecutorFramwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {


        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            for (int i=0; i<7; i++){
                service.execute(new Work(100));
            }
        }
    }

}



class Work implements Runnable{

    private final int workId;

    Work(int workId) {
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