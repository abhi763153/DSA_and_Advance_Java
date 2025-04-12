package Recursion;

import org.w3c.dom.ls.LSOutput;

public class fibancciByRecursion {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(fibbo(n));
    }

    public static int fibbo(int n){

        if( n ==0 || n == 1){
            return n;
        }

        return fibbo(n-2) + fibbo(n-1);
    }

}
