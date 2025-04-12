package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int arr[] = {9, 0, 2, 3, 2, 3, 9};

        mergSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergSort(int[] arr, int s, int e){

        if( s < e ){
            int mid = s + (e -s)/2;
            mergSort(arr, s, mid);
            mergSort(arr, mid+1, e);

            merge(arr, s, mid, e);
        }

    }


    public static void merge(int [] arr, int s, int mid, int e){

        int i = s;
        int j = mid+1;

        int temp[] = new int[e-s+1];
        int k = 0;

        while(i <= mid && j <= e){

            if( arr[i] > arr[j] ){
                temp[k++] = arr[j];
                j++;
            }
            else {
                temp[k++] = arr[i];
                i++;
            }


        }

        while(j <= e){
            temp[k++] = arr[j];
            j++;
        }
        while(i <= mid){
            temp[k++] = arr[i];
            i++;
        }

        k=0;
        for(int m=s; m <=e; m++){
            arr[m] = temp[k++];
        }
    }


}
