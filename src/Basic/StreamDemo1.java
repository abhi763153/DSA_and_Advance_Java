package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;



public class StreamDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,1,1,1,1));

        long count = list.stream().filter(n->n==1).count();

        int arr[] = {2,1,6,8,4,9,3,6,9};

        for(int i=0; i<arr.length; i+=2){
            if(i+2 < arr.length){
                int temp = arr[i];
                arr[i]=arr[i+2];
                arr[i+2] = temp;
            }
        }

        HashSet<Integer> set = new HashSet<>();

        set.add(3);





        System.out.println(count);
    }
}
