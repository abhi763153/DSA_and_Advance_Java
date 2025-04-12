package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        
        int n = 4;

        for (int i = 1; i <= 2 * n; i++) {

            int c = i>n ? 2 * n - i : i;

            for (int j = 0; j < n-c; j++) {
                System.out.print("  ");
            }

            for (int j = c; j >=1 ; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= c ; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
