package Map;

import OOPS.Student;

import java.util.HashMap;
import java.util.Objects;

public class HashMapDemo {
    public static void main(String[] args) {

        System.out.println(Objects.hashCode("Abhishek"));

        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student(12, "Abhishek", 79);
        Student s2 = new Student(2, "Rockey", 80);
        Student s3 = new Student(12, "Abhishek", 69);

        map.put(s1, "Engineer");
        map.put(s2, "Pilot");
        map.put(s3, "Actor");

        System.out.println(map);


















//        HashMap<String, Integer> student = new HashMap<>();
//
//        student.put(new String("Abhishek"), 87);
//        student.put(new String("Rockey"), 92);
//        student.put(new String("Abhishek"),98);
//
//        System.out.println(student);


    }
}
