package Multithreading;

public class SynchronizationMain {

    public static void main(String[] args) {

        Counter counter = new Counter();

        ThreadToIncrementCounter t1 = new ThreadToIncrementCounter(counter);
        ThreadToIncrementCounter t2 = new ThreadToIncrementCounter(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println(counter.getCount());
    }
}
