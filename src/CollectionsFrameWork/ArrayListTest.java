package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(56);
        al.add(12);
        al.add(34);
//        System.out.println(al);
//
//
//        al.add(1, 15);
//
//
        List<Integer> sublist = al.subList(1,3);

        sublist.set(1, 100);
        System.out.println(sublist);
        System.out.println(al);



//        for(int e: al){
//            System.out.println(e);
//        }
    }
}
