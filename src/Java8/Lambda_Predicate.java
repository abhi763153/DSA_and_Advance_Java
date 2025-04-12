package Java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda_Predicate {

    public static void main(String[] args) {

//        MathOps obj1 = new AddTwoNumber();
//        obj1.add(4,5);

        MathOps obj1 = new MathOps(){
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };

        obj1.add(3,4);

//        MathOps addOps = (a, b) -> System.out.println(a+b);


//        Predicate --> Function Interface --> Boolean Valued Function

//        Predicate<Integer> isEven = x -> x%2==0;
//        System.out.println(isEven.test(56));

        // Check a string start with A
        List<String> words = new ArrayList<>(Arrays.asList("Abhishek", "Batman", "Antman", "Captain America", "Avengers"));
//        Predicate<String> isStartWithA = x -> x.startsWith("A");

//        words.forEach(System.out::println);

        List<MobilePhone> mobilePhones = words.stream().map(x -> new MobilePhone(x)).collect(Collectors.toUnmodifiableList());

        mobilePhones.forEach(System.out::println);

//        List<String> wordsA = words.stream().filter(isStartWithA).collect(Collectors.toUnmodifiableList());
//        System.out.println(wordsA);
    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                '}';
    }
}

//class AddTwoNumber implements MathOps{
//
//    @Override
//    public void add(int a, int b) {
//        System.out.println(a + b);
//    }
//}
//
@FunctionalInterface
interface MathOps{
    void add(int a, int b);
//    void sub(int a, int b);
}
