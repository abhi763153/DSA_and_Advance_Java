package CollectionsFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {


        LinkedList<Integer> lk = new LinkedList<>();

        lk.add(4);
        lk.add(8);
        lk.add(2);
        lk.add(17);

        Iterator<Integer> it = lk.listIterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
    }
}
