package Recursion;

import java.util.ArrayList;

public class linearSearchRecursively {
    public static void main(String[] args) {

        int [] arr = { 2, 9, 0, 4, 6, 1, 3, 4, 3};
        int target = 3;

        ArrayList<Integer> ans = findAllIndex(arr, target, 0);

        System.out.println(ans);
    }

    public static ArrayList<Integer> findAllIndex(int [] arr, int target, int idx){

        ArrayList<Integer> al= new ArrayList<>();

        if(idx == arr.length){
            return al;
        }

        if(arr[idx] == target){
            al.add(idx);
        }


        ArrayList<Integer> res = findAllIndex(arr, target, idx+1);
        res.addAll(al);

        return res;
    }
}
