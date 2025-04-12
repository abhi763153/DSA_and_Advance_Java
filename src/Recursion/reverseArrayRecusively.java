package Recursion;

import java.util.Arrays;

public class reverseArrayRecusively {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 3, 1, 8, 9};

        reverse(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int s, int e){

        if(s > e) {
            return;
        }

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s+1, e-1);

    }
}
