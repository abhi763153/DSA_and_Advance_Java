package Set;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

//        TreeSet<String> set = new TreeSet<>();
//
//        set.add("Rockey");
//        set.add("Ganesh");
//        set.add("Prashant");
//        set.add("Mango");
//
//        System.out.println(set);
//        System.out.println(set.first());
//        System.out.println(set.last());
//
//        System.out.println(set.ceiling("Ganesh"));


        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.lower(20));
        System.out.println(set.floor(20));
    }
}
