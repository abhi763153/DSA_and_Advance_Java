package Java8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>(Arrays.asList(34, 56, 12, 33, 24, 53, 13));

//        list.add(34);
//        System.out.println(list);



        // 1. If you want to create stream from list you can use stream()
//        long count = list.stream().filter(x -> x % 2 == 0).count();
//        System.out.println(count);

        // 2. From Arrays
//        String [] arr = { "Captain America", "Thor", "Hulk", "Antman"};
//        Stream<String> arraysStream = Arrays.stream(arr);
//        List<String> Avengers = Arrays.stream(array).map(x -> "Avenger - " + x).collect(Collectors.toUnmodifiableList());
//        System.out.println(Avengers);

        // 3. Using Stream.of()
//        Stream<Integer> stream = Stream.of(4,68,12,35,23,13,24);

        // 4 Using Generate() method --> It helps to create infinite stream.
//        List<Integer> streamof1 = Stream.generate(() -> 1).limit(20).collect(Collectors.toUnmodifiableList()); // This is 1st way to create infinite stream.
//        System.out.println(streamof1);
          List<Integer> numbers = Stream.iterate(1, x -> x+1).limit(50).collect(Collectors.toList());
//        System.out.println(numbers);

        // To create infinit stream we can use Stream.generate() or Stream.iterate()


//        List<Integer> sortedList = list.stream().sorted().toList();
//
//        System.out.println(sortedList);

//        List<Integer> list = new ArrayList<>(Arrays.asList(48, 67, 15, 33, 25, 53, 73, 15));
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 1, 3, 2, 5, 7, 1));

//        Integer[] arr = list.stream().toArray((x) -> new Integer[x]);
//
//        System.out.println(Arrays.toString(arr))

//
//        Integer sum = list.stream().filter((x) -> x % 2 == 0).reduce(0, (x,y)->x+y);

//        int sum = list.stream().filter((x) -> x%2==0).mapToInt(x -> x).sum();

//        List<Integer> sorted = list.stream().filter((x) -> x>50).sorted(Collections.reverseOrder()).toList();

        String [] arr = { "Captain America", "AThor", "Hulk", "Antman"};
//
//        Long count = Arrays.stream(arr).filter((x) -> x.startsWith("A")).collect(Collectors.counting());

//        Optional<Integer> secondHIghest = list.stream().sorted((a,b)->b-a).skip(2).findFirst();

//        Map<String, Integer> map = Arrays.stream(arr).collect(Collectors.toMap(str -> str, str->str.length()));

//        Set<Integer> set = list.stream().distinct().collect(Collectors.toSet());

//        OptionalDouble avg = list.stream().mapToInt(x->x).average();

//        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x->x%2==0));

        Optional<String> str = Arrays.stream(arr).sorted((a, b) -> b.length() - a.length()).findFirst();

        System.out.println(str.get());


    }
}
