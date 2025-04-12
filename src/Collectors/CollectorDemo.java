package Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorDemo {
    public static void main(String[] args) {

        // To list using collector()
//        List<Integer> list = new ArrayList<>(Arrays.asList(23,13,4,56,89,100, 34,13));
//        Set<Integer> set = list.stream().collect(Collectors.toSet());
//        System.out.println(set);

        // Collecting to specified  Collection
//        list.stream().collect(Collectors.toCollection(() -> new Stack<>())).forEach(System.out::println);
//        System.out.println(stack.getClass().getSimpleName());



//        1. Custom Partitioning
//
//        Partition a list of integers into two groups: those that are prime and those that are not, using Collectors.partitioningBy.
//        Map<Boolean, List<Integer>> collect = numStream.collect(Collectors.partitioningBy(x ->{

//        int[] numbers = {3, 45, 13, 24, 57, 29, 5, 11, 76, 29, 0};
//
//        IntStream stream = Arrays.stream(numbers);
//        Stream<Integer> numStream = stream.boxed();
//
//            if (x <= 1) return false;
//            for(int i=2; i<=x/2; i++){
//                if(x % i ==0){
//                    return false;
//                }
//            }
//            return true;
//        }));
//
//        System.out.println(collect);


//        2. Nested Grouping
//        Group a list of strings by their lengths, and then within each length group, group the strings by their first character.

//        String [] avengers = { "CaptainAmerica", "Thor", "Hulk", "Antman", "WonderWomen", "BlackPanther", "Fury", "SpiderMan", "IronMan"};
//        Map<Integer, List<String>> map1 = Arrays.stream(avengers).collect(Collectors.groupingBy(String::length));
//        Map<Integer, Map<Character, List<String>>> map = Arrays.stream(avengers).collect(Collectors.groupingBy(String::length, Collectors.groupingBy(x -> x.charAt(0))));
//
//        System.out.println(map1);
//        System.out.println(map);



        


    }
}
