package Java8;

//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;

import java.util.*;

public class GroupByLengthOfwords {

    public static void main(String[] args) {

//        List<String> fruits = Arrays.asList("banana", "Guava", "grapes", "mango", "Lichi", "Apple", "Orange", "Kivi", "Strawberry","Pineapple", "Watermelon");
//
//        Map<Integer, List<String>> map = fruits.stream().collect(Collectors.groupingBy(String::length));
//
//        map.entrySet().forEach(x -> {
//            System.out.print(x.getKey()+" --> ");
//            x.getValue().forEach(v -> System.out.print(v+", "));
//            System.out.println();
//        });

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 7,-6, -2));

        int secondHighest = list.stream().sorted(Integer::compareTo).toList().get(list.size()-2);

        System.out.println(secondHighest);
  
        


    }
}
