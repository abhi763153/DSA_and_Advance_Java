package OOPS;

import java.time.LocalDateTime;

public class Human {

    public String name;
    public int age;
    public int salary;
    public boolean married;

    static long population;

    public Human(String name, int age, int salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    public Thought thinking() {
        return new Thought("Why everything bad thing happened with me only", "Negative", LocalDateTime.now());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }

}
