package Recursion;

public class subSequence {
    public static void main(String[] args) {


       subseq("", "abc");
    }

    public static void subseq(String ans, String str){

        if(str.isEmpty()){
            System.out.print(ans+" ");
            return;
        }

        subseq(ans + str.charAt(0), str.substring(1));
        subseq(ans, str.substring(1));
    }
}
