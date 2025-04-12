package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndSafeExample {

    public static void main(String[] args) {

//        List<Integer> al = new ArrayList<>();
        List<Integer> al = new CopyOnWriteArrayList<>();

        al.add(100);
        al.add(200);
        al.add(50);


        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext()){
            System.out.println("Number : "+ iterator.next());
            al.add(400);
        }

        System.out.println(al);
    }
}
