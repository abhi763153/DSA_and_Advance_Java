package Patterns;

public class Pattern3 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < 2*n; i++) {

            int col = i>n? 2*n - i : i;

            for (int j = 0; j <n-col; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < col; j++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
