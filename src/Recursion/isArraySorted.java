package Recursion;

public class isArraySorted {
    public static void main(String[] args) {

        int[] arr = { 8, 14, 2, 34, 45 };

        System.out.println(isSorted(arr, arr.length-1));
    }

    public static boolean isSorted( int [] arr, int idx){

        if(idx == 0){
            return true;
        }

        return isSorted(arr, idx-1) && arr[idx-1] <= arr[idx];
    }
}
