package CollectionsFrameWork;

import java.util.*;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(2);
        q.offer(5);
        q.offer(0);

//        System.out.println(q);
//
//        System.out.println(q.peek());
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//
//        q.offer(100);
//
//        System.out.println(q);

        Stack<Integer> st = new Stack<>();

        st.push(23);
        st.push(14);
        st.push(67);

//        System.out.println(st);
//
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(23);
        dq.offer(12);
        dq.offer(28);
        dq.offer(45);

//        System.out.println(dq);
//
////        System.out.println(dq.peek());
//
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());
//
//        System.out.println(dq.pollFirst());
//        System.out.println(dq.pollLast());
//
//        dq.offerFirst(100);
//        dq.offerLast(200);
//
//        System.out.println(dq);

    }
}
