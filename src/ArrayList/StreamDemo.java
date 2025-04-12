package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Aman", "Rahul", "Deepak"));

        String res = list.stream().collect(Collectors.joining(", "));


        System.out.println(res);
    }
}
