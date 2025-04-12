package Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(34,25,12,34,6,23));

//        for (Integer e: list){
//            if(e%2 ==0){
//                list.remove(e);
//            }
//            System.out.println("Numbers : "+ e);
//        }
//
//        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number % 2==0){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
