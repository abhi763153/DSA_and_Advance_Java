package ArrayList;

import OOPS.Human;
import OOPS.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CustomeMyComparator implements Comparator<Integer>{

    public int compare(Integer o1, Integer o2){
        return Integer.compare(o2, o1);
    }
}

public class ArrayListExamples {


    public static void main(String[] args) {

//        Human h1 = new Human("Abhishek", 23, 26000, false);
//        Student s1 = new Student(12, "Raushan", 456);
//
//
//        ArrayList<Object> al = new ArrayList<>();
//
//        al.add(h1);
//        al.add(s1);
//
//        System.out.println(al);


        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(98);

//        Object[] arr = list.toArray();
//        System.out.println(arr.getClass());
//        System.out.println(arr);
//
//        Integer[] array = list.toArray(new Integer[0]);
//        System.out.println(array);

        list.sort((o1, o2) ->  Integer.compare(o2,o1));
        System.out.println(list);
    }
}
