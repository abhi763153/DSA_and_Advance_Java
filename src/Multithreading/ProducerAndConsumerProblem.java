package Multithreading;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumerProblem {
    public static void main(String[] args) {

        Worker worker = new Worker(0,5);

        Thread producer = new Thread(()->{
            try {
                worker.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(()->{
            try {
                worker.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
    }
}

class Worker{

    private int sequence = 0;
    private final Integer max;
    private final Integer min;
    private final List<Integer> container;

    private Object lock = new Object();

    public Worker(Integer min, Integer max) {
        this.max = max;
        this.min = min;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException {
        synchronized (lock){
            while (true){

                if(container.size() == max){
                    System.out.println("Container full, waiting for the items to be removed ...");
                    lock.wait();
                }else{
                    System.out.println(sequence + " added to container");
                    container.add(sequence++);
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (lock){
            while (true){
                if(container.size() == min){
                    System.out.println("Container empty, waiting for the items to be added ...");
                    lock.wait();
                }else {
                    System.out.println(container.removeFirst() + " removed from the container ");
                    lock.notify();
                }
                Thread.sleep(500);
            }
        }
    }

}