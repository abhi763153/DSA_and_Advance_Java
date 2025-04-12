package Multithreading;

public class multitrhreading {


    public static void main(String[] args) {

        Test test = new Test();
        test.start();

        for(int i=0; i<10000; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
