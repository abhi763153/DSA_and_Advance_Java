package Java8;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntermeditateOperations {

    public static void main(String[] args) {
//            List<String> list = Arrays.asList("Ram", "Shyam", "Sachin", "Aman", "Rockey", "Naresh", "Abhi", "Aakash");

//            list.stream().
//
//            String str = "Hello World";
//            IntStream streamofchar = str.chars().filter(c -> {
//                System.out.println("Couting : "+c);
//                return c=='l';
//            });
//            System.out.println("Before terminal operation : ");
//
//        System.out.println(streamofchar.count());

        // flatmap
        // Handle streams of collections, lists or arrays where each element itself a collection.
        // Flatten nested structure ( e.g. list with lists) so that they can be accessed as single sequence of elements.

        List<List<Integer>> listOfLists = new ArrayList<>(Arrays.asList(Arrays.asList(23,45,12), Arrays.asList(9,8,7), Arrays.asList(12,34,1,23,45,0,98,76), Arrays.asList(0,1)));

        List<Integer> list = listOfLists.stream()
                        .flatMap(x -> x.stream())
                        .map(x -> x * 2)
                        .toList();

        System.out.println(list);


        List<String> listOfString = new ArrayList<>(Arrays.asList(
                "This is my workplace",
                "Captain America",
                "Avenger war on Mars",
                "The dark night"
        ));

        List<String> words = listOfString.stream()
                .flatMap(string -> Arrays.stream(string.split(" ")))
                .map(String::toUpperCase)
                .toList();

        System.out.println(words);

    }
}
