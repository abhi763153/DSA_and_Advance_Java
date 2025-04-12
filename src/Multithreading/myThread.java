package Multithreading;

public class myThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        myThread t1 = new myThread();
        t1.start();
        t1.join();
        System.out.println("Hello World");
//        System.out.println(t1.getState());
//        System.out.println(Thread.currentThread().getState());
//        t1.start();
//        System.out.println(t1.getState());
//        Thread.sleep(3000);
//        System.out.println(Thread.currentThread().getState());
//        System.out.println(t1.getState());




    }
}
