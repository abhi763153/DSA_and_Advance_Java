package Multithreading;

public class ThreadToIncrementCounter extends Thread{

    Counter counter;

    public ThreadToIncrementCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            counter.increment();
        }
    }
}
