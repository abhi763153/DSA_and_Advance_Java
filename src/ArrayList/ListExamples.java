package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListExamples {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);

        System.out.println(list);

        List<String> list1 =  Arrays.asList("Monday", "Tuesday"); // Return fixed size of list, but modifiable

        String[] fruits = {"Banana", "Apple", "Grapes"};

        List<String> fruit_s = Arrays.asList(fruits);

        System.out.println(list1.getClass().getName());


        List<Integer> immutable_list = List.of(1,2,3,4);

//        immutable_list.set(2,100);

//        System.out.println(immutable_list);

        list.addAll(immutable_list);

        list.remove(Integer.valueOf(3));

        System.out.println(list);

        Object[] arr =  list.toArray();
        Integer[] arr2 =  list.toArray(new Integer[0]);

        System.out.println(arr);
    }
}
