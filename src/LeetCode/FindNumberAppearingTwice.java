package LeetCode;

import java.util.Arrays;

public class FindNumberAppearingTwice {

    public static void main(String[] args) {

        int arr[] = {3,5,6,1,0,4,6};
        int freq[] = new int[Arrays.stream(arr).max().getAsInt()+1];

        for(int a: arr){
            if(freq[a] == 0){
                ++freq[a];
            }else {
                System.out.println("Number appearing twice : " + a);
                break;
            }
        }

    }
}
