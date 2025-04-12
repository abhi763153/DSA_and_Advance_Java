package Multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SychronizedList {

    public static void main(String[] args) {


        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Thread t1 = new Thread(()->{

            for (int i=0; i<=5; i++){
                list.add(i);
                System.out.println(Thread.currentThread().getName() +": added - "+i);

            }
        });

        Thread t2 = new Thread(()->{

            for (int i=0; i<=5; i++){
                System.out.println(Thread.currentThread().getName() +": Ele : " +list.get(i));
            }

            try {
                Thread.sleep(500);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
