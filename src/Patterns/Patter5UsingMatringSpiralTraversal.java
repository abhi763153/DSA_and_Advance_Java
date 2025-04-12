package Patterns;

public class Patter5UsingMatringSpiralTraversal {


    public static void main(String[] args) {

        int n = 4;
        int arr[][] = new int[2*n-1][2*n-1];

        int minr = 0, maxr = arr.length-1, minc = 0, maxc = arr[0].length-1;

        int total = (2*n-1) * (2*n-1);
        int count = 0;




        while(count < total){

            for (int i = minc; i <=maxc && count < total; i++) {
                arr[minr][i] = n;
                count++;
            }
            minr++;

            for (int i = minr; i <=maxr && count < total; i++) {
                arr[i][maxc] = n;
                count++;
            }
            maxc--;

            for (int i = maxc; i >= minc && count < total; i--) {
                arr[maxr][i] = n;
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count < total; i--) {
                arr[i][minc] = n;
                count++;
            }
            minc++;
            n--;




        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
