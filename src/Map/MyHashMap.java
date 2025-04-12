package Map;

import java.util.ArrayList;
import java.util.Objects;

public class MyHashMap<K, V> {

    private class Node{
        private K key;
        private V val;
        private Node next;

        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    ArrayList<Node> bucket;

    public MyHashMap(){
        this.bucket = new ArrayList<>(16);
        for(int i = 0; i < 16; i++) {
            bucket.add(null);  // Ensures slots are initialized
        }
    }

    public void put(K key, V val){
        int hassCode = getHashCode(key);
        int idx = hassCode % bucket.size();

        Node head = bucket.get(idx);

        while(head != null){
            if(head.key.equals(key)){
                head.val = val;
                return;
            }
            head = head.next;
        }

       Node newNode = new Node(key, val);
        newNode.next = bucket.get(idx);
        bucket.set(idx, newNode);

    }

    private int getHashCode(K key) {
        return Objects.hashCode(key);
    }


}
