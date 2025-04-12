package Java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperation {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(23, 45, 12, 35, 43, 9, 87);
//        System.out.println(numbers.max(Comparator.naturalOrder()).get());
//        System.out.println(numbers.min(Comparator.naturalOrder()).get());


//        Stream.generate(() -> 10).skip(20).limit(30).forEach(System.out::println);

        List<Integer> list = Stream.iterate (1, (x) -> x*3).limit(20).filter(x -> (x % 3 ==0 )).toList();
        System.out.println(list);

        // flatmap
    }



}
