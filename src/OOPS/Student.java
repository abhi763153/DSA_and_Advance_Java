package OOPS;

import Basic.Message;

import java.util.Objects;


public class Student {

    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }

        Student s1 = (Student) obj;

        return roll == s1.roll && Objects.equals(name, s1.name);
    }
}


class Teacher{
    String name;
    String sub;
    int salary;

    Teacher(String name, String sub, int salary){
        this.name = name;
        this.sub = sub;
        this.salary = salary;
    }

    void teaching(){
        System.out.println("Teacher is teaching" + this.sub);

     }

    @Override
    public String toString() {
        return "Teacher name : "+ this.name+ "\nSubject : "+this.sub + "\nTeacher's salary : "+ this.salary;
    }
}
