package Recursion;
import java.util.List;
import java.util.ArrayList;

public class tripletSubsequence {

    public static void main(String[] args) {

        int arr[] = {1,1,1,1};

        System.out.println(increasingTriplet(arr));

    }


    static boolean flag = false;

    public static boolean increasingTriplet(int[] nums) {

        List<Integer> al = new ArrayList<>();

        subSeq(nums, 0, al);

        return flag;

    }

    public static void subSeq(int[] arr, int s, List<Integer> al){

        if(s >= arr.length){
            if(al.size() == 3){
                if(al.get(0) < al.get(1) && al.get(1) < al.get(2)){
                    flag = true;
                }
            }

            return;
        }



        int val = arr[s];
        al.add(val);
        subSeq(arr, s+1, al);
        al.remove(al.size()-1);
        subSeq(arr, s+1, al);
    }
}
