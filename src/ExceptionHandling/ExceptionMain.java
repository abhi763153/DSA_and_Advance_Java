package ExceptionHandling;


import OOPS.Student;

import java.util.Arrays;

public class ExceptionMain {

    public static void main(String[] args) {

        try {
            level1();
        }
        catch (Exception o){
//            StackTraceElement[] stackTraceElements = o.getStackTrace();
//            Arrays.str+++eam(stackTraceElements).forEach(e -> System.out.println(e));
            o.printStackTrace();
        }
    }

    public static void level3(){
        int[] arr = new int[5];
        arr[5] = 10;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }
}
