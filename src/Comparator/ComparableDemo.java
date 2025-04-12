package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Aman", 88));
        list.add(new Student("Naresh", 23));
        list.add(new Student("Rahul", 56));
        list.add(new Student("Rockey", 78));

        list.sort(null);
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(23,14,56,0,78));

//        numbers.sort(null);



        System.out.println(list);
    }

}
