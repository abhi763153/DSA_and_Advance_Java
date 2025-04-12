package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class groupThemByTheirFirstCharacter {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "ant", "bat", "ball", "cat", "car", "cart");

        Map<Character, Long> map = words.stream()
                .collect(Collectors.groupingBy((word) -> word.charAt(0), Collectors.counting()));

        System.out.println(map);


    }
}
