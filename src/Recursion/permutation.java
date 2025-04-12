package Recursion;

public class permutation {
    public static void main(String[] args) {

        String str = "abc";

        getPermutations(str, "");
    }

    public static void getPermutations(String str, String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        for(int i=0; i<=ans.length(); i++){
            String temp = ans.substring(0, i) + ch + ans.substring(i);
            getPermutations(str.substring(1), temp);
        }

    }
}
