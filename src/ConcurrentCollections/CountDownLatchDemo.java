package ConcurrentCollections;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        int numberOfChef = 3;

        CountDownLatch latch = new CountDownLatch(numberOfChef);

        new Thread(new Chef("Chef A", "Pizza", latch)).start();
        new Thread(new Chef("Chef B", "Burger", latch)).start();
        new Thread(new Chef("Chef C", "Noodles", latch)).start();

        latch.await();

        System.out.println("All the dishes are ready!");

    }
}


class Chef implements Runnable{
    
    private final String name;
    private final String dish;
    private final CountDownLatch latch;

    Chef(String name, String dish, CountDownLatch latch) {
        this.name = name;
        this.dish = dish;
        this.latch = latch;
    }

    @Override
    public void run() {

        try {
            System.out.println(name + " is preparing "+ dish);
            Thread.sleep(2000);
            System.out.println(dish +" has been prepared by "+ name);
            latch.countDown();
        }
        catch (InterruptedException e){
            throw new RuntimeException();
        }
    }
}
