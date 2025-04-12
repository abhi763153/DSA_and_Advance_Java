package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2,3,5,6,7,1,0,8,5,9));

        list.parallelStream()
                .peek(x -> System.out.println(Thread.currentThread().getName() + " thread for : "+x));
    }
}
