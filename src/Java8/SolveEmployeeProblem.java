package Java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SolveEmployeeProblem {

    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 80000, 25),
                new Employee("Bob", "HR", 60000, 35),
                new Employee("Charlie", "IT", 95000, 40),
                new Employee("David", "HR", 75000, 50),
                new Employee("Eve", "Sales", 55000, 29),
                new Employee("Frank", "Sales", 65000, 35)
        );


//        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Map<String, List<String>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));

//        String name = employees.stream().sorted((a, b) -> b.getAge() - a.getAge()).skip(1).findFirst().get().getName();
//        System.out.println(name);
//
//        System.out.println(employees.stream().collect(Collectors.groupingBy((x) -> x.getDepartment(), Collectors.counting())));


//        String res = employees.stream().collect(Collectors.groupingBy(Employee::getName)).keySet().stream().collect(Collectors.joining(", "));

        List<String> departments = employees.stream()
                .map(x -> x.getDepartment())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(departments);
    }
}
