package Multithreading;

import javax.swing.*;

class SharedResource{

    private  int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while (hasData){
            try {
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced "+ value);
        notify();
    }

    public synchronized int cosume() {

        while (!hasData){
            try{
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
        hasData = false;
        System.out.println("Consumed "+ data);
        notify();
        return data;
    }
}

class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            resource.produce(i);
        }
    }
}

class Cosumer implements Runnable{

    private SharedResource resource;

    public Cosumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            int value = resource.cosume();
        }
    }
}

public class ThreadCommunication {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(new Producer(resource));
        Thread t2 = new Thread(new Cosumer(resource));

        t1.start();
        t2.start();
    }


}
