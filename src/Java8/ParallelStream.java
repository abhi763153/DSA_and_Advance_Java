package Java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static Recursion.factorial.factorial;

public class ParallelStream {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> factorials = list.stream().map(ParallelStream::factorial).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken in sequential stream operation : " + (endTime-startTime));


         startTime = System.currentTimeMillis();
        List<Long> factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
         endTime = System.currentTimeMillis();

        System.out.println("Time taken in paralllel streamG operation : " + (endTime-startTime));

    }

    public static long factorial(int x){
        long result = 1;
        for(int i=2; i<=x; i++){
            result *= i;
        }
        return result;
    }
}
