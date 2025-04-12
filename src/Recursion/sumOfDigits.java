package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 9087;

        System.out.println(findDigitSum(n));
    }

    public static int findDigitSum(int n){

        if(n <= 9){
            return n;
        }

        return n % 10 + findDigitSum(n / 10);
    }
}
