package CollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {


    public static void main(String[] args) {

        List<studentMarks> list = new ArrayList<>();
        list.add(new studentMarks(70, 60, 89));
        list.add(new studentMarks(90, 40, 69));
        list.add(new studentMarks(70, 67, 98));
        list.add(new studentMarks(40, 56, 57));
        list.add(new studentMarks(87, 67, 75));



        PriorityQueue<studentMarks> pq = new PriorityQueue<>(new myCustomComparator());
        pq.addAll(list);

        List<studentMarks> top3 = new ArrayList<>();
        int i = 0;

        while (!pq.isEmpty()){

            if( i == 3 )break;

            top3.add(pq.poll());
            i++;
        }

        System.out.println(top3);
    }
}
