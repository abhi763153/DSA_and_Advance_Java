package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(20, 0.7f, true);

        map.put("Apple", 78);
        map.put("Grape", 69);
        map.put("Watermelon", 87);
        System.out.println(map);

        map.get("Grape");
        map.put("Kiwi", 34);
        map.get("Watermelon");

        System.out.println(map);
    }
}
