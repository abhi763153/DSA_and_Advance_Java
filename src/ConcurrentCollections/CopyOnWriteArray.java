package ConcurrentCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArray {
    public static void main(String[] args) {
        Simulation simulator = new Simulation();
        simulator.simulate();
    }
}

class Simulation{
    private final List<Integer> list;

    public Simulation() {
        this.list = new CopyOnWriteArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0));
    }

    public void simulate(){
        Thread one = new Thread(new WriteTask(list));
        Thread two = new Thread(new WriteTask(list));
        Thread three = new Thread(new WriteTask(list));
        Thread four = new Thread(new ReadTask(list));

        one.start();
        two.start();
        three.start();
        four.start();
    }
}

class ReadTask implements Runnable{
    private final List<Integer> list;

    ReadTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
            System.out.println(list);
        }
    }
}

class WriteTask implements Runnable{
    private final List<Integer> list;
    private final Random random;

    WriteTask(List<Integer> list) {
        this.list = list;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
            list.set(random.nextInt(list.size()),random.nextInt(10));
        }
    }
}