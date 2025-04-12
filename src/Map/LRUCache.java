package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return capacity < this.size();
    }

    public static void main(String[] args) {


        LRUCache<String, Integer> studentMap = new LRUCache<String, Integer>(3);

        studentMap.put("Abhi", 89);
        studentMap.put("Rockey", 99);
        studentMap.put("Naresh", 68);
        studentMap.get("Abhi");
        studentMap.put("Aman", 608);

        System.out.println(studentMap);

    }
}
