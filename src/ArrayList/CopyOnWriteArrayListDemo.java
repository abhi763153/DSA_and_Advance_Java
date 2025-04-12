package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> list = new ArrayList<>();

        list.add("Egg");
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");

//        for(String fruit: list){
//
//            System.out.println(fruit);
//            if(fruit.equals("Banana")){
//                list.add("Butter");
//                System.out.println("Added Butter while reading");
//            }
//        }
//
//        System.out.println("Updated Shopping List : " + list);


        Thread t1 = new Thread(() ->{

            while(true){

                for (String item: list){
                    try {
                        Thread.sleep(100);
                        System.out.println("Reading item "+ item);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() ->{

                try {
                    Thread.sleep(500);
                    list.add("Milk");
                    System.out.println("Milk Item is added");

                    Thread.sleep(500);
                    list.remove("Banana");
                    System.out.println("Banana Item is removed");
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
        });

        t1.start();
        t2.start();

    }
}
