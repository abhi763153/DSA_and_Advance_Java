package Multithreading;

public class DemonThread extends Thread{

    @Override
    public void run(){

        while(true){
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {

        DemonThread t1 = new DemonThread();
        t1.setDaemon(true);

        t1.start();




        System.out.println("Main thread end here!");
    }
}
