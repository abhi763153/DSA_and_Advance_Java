package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Rockey", 34));
        list.add(new Student("Rahul", 66));
        list.add(new Student("Aman", 18));
        list.add(new Student("zaresh", 53));
        list.add(new Student("Sachin", 53));



//        list.sort((s1, s2)  -> s1.getRoll() - s2.getRoll());

        Comparator<Student> comparator = Comparator.comparing(Student::getRoll).reversed().thenComparing(Student::getName);
        list.sort(comparator);

        for (Student s: list){
            System.out.println(s.getName() + " --> "+ s.getRoll());
        }
    }
}
