package OOPS;

public class staticBlock {

    static  int a = 10;
    static int b;

    // static block is executed only once when a first object is created and the class is loaded first time,
    // it will not executed again on object creation.

    static {
        System.out.println("I am in static block");
        b = a * 5;
    }


    public static void main(String[] args) {

        staticBlock obj1 = new staticBlock();

        System.out.println(staticBlock.a + " "+ staticBlock.b);

        staticBlock obj2 = new staticBlock();
        System.out.println(obj1.a + " "+ obj1.b);
    }
}
