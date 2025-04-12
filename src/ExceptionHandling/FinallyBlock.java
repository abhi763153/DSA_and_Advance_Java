package ExceptionHandling;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            int a=3, b=2;
            System.out.println(a/b);
            throw new ArithmeticException("You can devide by zero");
        }finally {
            System.out.println("This block will always be executed!");
        }

    }
}
