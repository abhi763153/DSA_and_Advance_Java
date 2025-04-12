package Queue;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    List<Integer> list;

    public MyPriorityQueue(){
        list = new ArrayList<>();
    }



    public void add(int data) {
        list.add(data);
        upHeapify(list.size()-1);
    }

    public int poll(){

        int data = list.get(0);
        swap(0, list.size()-1);
        list.remove(list.size()-1);


        downHeapify(0);


        return data;
    }

    public int peek(){

        if(this.list.isEmpty()){
            return -1;
        }

        return list.get(0);
    }

    public void upHeapify(int idx){

        if(idx == 0){
            return;
        }

        int pi = (idx - 1)/2;

        if(list.get(idx) > list.get(pi)){
            swap(idx, pi);
        }

        upHeapify(pi);


//      This comment code is doing same but in iterative way
//        int ci = list.size()-1;
//        int pi = (ci-1)/2;
//
//        while(pi >= 0 && list.get(pi)>list.get(ci)){
//            int temp = list.get(pi);
//            list.set(pi, list.get(ci));
//            list.set(ci, temp);
//            ci = pi;
//            pi = (ci-1)/2;
//        }
    }

    public void downHeapify(int idx){

        if(idx == list.size()-1){
            return;
        }

        int c = 2 * idx + 1;

        if(list.get(idx) < list.get(c)){
            swap(idx, c);
        }

        downHeapify(c);


//      This comment code is doing same but in iterative way
//
//        int pi = 0;
//        int lci = 2*pi + 1;
//        int rci = 2*pi + 2;
//
//
//        while(lci <= list.size()-1){
//
//            if(list.get(lci) <= list.get(pi) && list.get(lci) < list.get(rci)){
//                int temp = list.get(pi);
//                list.set(pi, list.get(lci));
//                list.set(lci, temp);
//                pi = lci;
//                lci = 2*pi + 1;
//                rci = 2*pi + 2;
//            }
//            if(list.get(rci) <= list.get(pi) && list.get(rci) < list.get(lci)){
//                int temp = list.get(pi);
//                list.set(pi, list.get(rci));
//                list.set(rci, temp);
//                pi = rci;
//                lci = 2*pi + 1;
//                rci = 2*pi + 2;
//            }
//
//
//        }

    }

    public void swap(int c, int p){
        int temp = list.get(p);
        list.set(p, list.get(c));
        list.set(c, temp);
    }



    public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue();
        pq.add(23);
        pq.add(45);
        pq.add(12);
        pq.add(14);
        pq.add(30);
//        pq.add(56);
//        pq.add(8);
//        pq.add(22);

        System.out.println(pq.list);

        System.out.println(pq.poll());
//        System.out.println(pq.poll());

        pq.add(25);
        pq.add(58);


        System.out.println(pq.list);
    }

}
