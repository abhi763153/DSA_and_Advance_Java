package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(23, "Abhi");
        map.put(24, "Rockey");
        map.put(25, "Naresh");
        map.put(22, "Aman");

        // way 1

//        for(Map.Entry<Integer, String > entry : map.entrySet()){
//            System.out.println(entry.getKey() + " -> "+ entry.getValue());
//        }
//
//        // way 2
//
//        for( Integer key: map.keySet()){
//            System.out.println(key + " -> "+ map.get(key));
//        }

        // way 3

        Iterator<Integer> it = map.keySet().iterator();

        while(it.hasNext()){
            Integer key = it.next();
            System.out.println(key + " -> "+ map.get(key));
        }

    }
}
