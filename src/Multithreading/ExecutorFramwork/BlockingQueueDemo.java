package Multithreading.ExecutorFramwork;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

    public static void main(String[] args) {


        BlockingQueue<Integer> queue = new ArrayBlockingQueue(5);

        Thread producer = new Thread(()->{

            try {
                for (int i=1; i<10; i++){
                    queue.put(i);
                    System.out.println("Element produced : "+ i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread consumer1 = new Thread(()->{

            try{
                while (true){
                    Integer e = queue.take();
                    System.out.println("Element consumed : "+ e+ " by Consumer1");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        Thread consumer2 = new Thread(()->{

            try{
                while (true){
                    Integer e = queue.take();
                    System.out.println("Element consumed : "+ e + " by Consumer2");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
