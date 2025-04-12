package MemoryManagementGC;

import OOPS.Student;

public class MemoryGC {

    public static void main(String[] args) {

        int a = 10;
        Student student = new Student(1, "Abhishek", 90);
        MemoryGC memorygc = new MemoryGC();
        String greet = "Good morning";
        memorygc.memoryManagementTest(student);

    }

    public  void memoryManagementTest(Student s2){

        Student student2 = s2;
        String greet2 = "Good morning";
        String  greet3 = new String("Good morning");
    }
}
