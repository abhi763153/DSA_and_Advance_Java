package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        String input = "bananann";

//        Map.Entry<Character, Long> max = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet().stream().max((e1, e2) -> Long.compare(e1.getValue(), e2.getValue())).orElse(null);
//
//        System.out.println(max.getKey()+ " -> " +max.getValue());

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: input.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
//            System.out.println(ch + " " + map.get(ch));
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        list.stream().forEach((e)-> System.out.println(e.getKey()+" -> "+ e.getValue()));




    }
}
