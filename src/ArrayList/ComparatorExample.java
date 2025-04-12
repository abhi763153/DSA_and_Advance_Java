package ArrayList;

import java.util.*;


//class StringLengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//    }
//
//}

class Student{
    String name;
    double cgpa;

    public Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class ComparatorExample {


    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(28,45,12,8,34,23));
//
//        al.sort(null);
//        System.out.println(al);
//
//        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Mango", "Pomegranates", "Pee", "Strawberry"));
//
//        fruits.sort((a, b) -> b.length() - a.length());
//
//        System.out.println(fruits);

        List<Student> list = new ArrayList<>();

        list.add(new Student("Abhishek", 8.98));
        list.add(new Student("Rockey", 9.47));
        list.add(new Student("Naresh", 8.79));

        list.sort((a, b) -> {
            if(b.cgpa - a.cgpa > 0){
                return 1;
            }
            if(b.cgpa - a.cgpa < 0){
                return  -1;
            }
            else{
                return 0;
            }
        });

        for (Student s: list){
            System.out.println(s.name + " : "+ s.cgpa);
        }

    }


}
