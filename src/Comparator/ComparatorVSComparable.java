package Comparator;

import java.util.*;

public class ComparatorVSComparable {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(23, "zbhi");
        map.put(24, "Rockey");
        map.put(25, "Naresh");
        map.put(22, "Aman");

//        sortMapUsingComparator(map);
//        sortMapUsingLambda(map);

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Abhishek", 23, "abhi@gmail.com"));
        list.add(new Employee(2, "Aman", 22, "aman@gmail.com"));
        list.add(new Employee(3, "Rahul", 25, "rahul@gmail.com"));
        list.add(new Employee(4, "Nithish", 22, "nitish@gmail.com"));

        Collections.sort(list, (e1, e2)->{

            if(e2.getAge() - e1.getAge() > 0){
                return 1;
            }else if(e2.getAge() - e1.getAge() < 0){
                return -1;
            }else{
                return e1.getName().compareTo(e2.getName());
            }
        });
        System.out.println(list);


    }

    private static void sortMapUsingLambda(Map<Integer, String> map) {
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " -> "+ entry.getValue()));
    }

    private static void sortMapUsingComparator(Map<Integer, String> map) {
        List<Map.Entry<Integer, String >> sortedMap = new ArrayList<>(map.entrySet());
        Collections.sort(sortedMap, new CustomeCoparator());
        System.out.println(sortedMap);
    }

}

class Employee implements Comparable<Employee>{
    private int empId;
    private String name;
    private int age;
    private String email;

    public Employee(int empId, String name, int age, String email) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}

class CustomeCoparator implements Comparator<Map.Entry<Integer, String>>{

    @Override
    public int compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2) {
        return e1.getValue().compareTo(e2.getValue());
    }
}
