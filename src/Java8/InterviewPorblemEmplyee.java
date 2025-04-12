package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private int salary;

    Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


public class InterviewPorblemEmplyee {

    public static void main(String[] args) {
        List<Employee1> employees = Arrays.asList(
                new Employee1("Employee1", 100000),
                new Employee1("Employee2", 100000),
                new Employee1("Employee3", 100000),
                new Employee1("Employee4", 100000),
                new Employee1("Employee5", 100000),
                new Employee1("Employee6", 95000),
                new Employee1("Employee7", 95000),
                new Employee1("Employee8", 95000),
                new Employee1("Employee9", 85000),
                new Employee1("Employee10", 85000)
        );

        List<Employee1> list = employees
                .stream()
                .sorted((x,y) -> y.getSalary()-x.getSalary()).skip(5).limit(3).toList();

        for(Employee1 e: list){
            System.out.println(e.getName() +" --> "+ e.getSalary());
        }

    }

}
