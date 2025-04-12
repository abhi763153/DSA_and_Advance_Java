package Map;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>((a,b) -> b-a);

        map.put(23, "Abhishek");
        map.put(45, "Aman");
        map.put(12, "Ram");
        map.put(9, "Rockey");

        System.out.println(map);

        // If you want to make a map immutable then you should use unmodifieable method

        Map<Integer, String> map2 = Collections.unmodifiableMap(map);

        map2.put(23, "Rahul");

        System.out.println(map2);

        // Second way to create immutable map

        Map<String, Integer> map3 = Map.of("Sachin", 23, "Ajay", 45, "Tanmay", 67);


    }
}
