package OOPS;

//class Test{
//    static String name;
//
//    public Test(String name){
//        Test.name = name;
//    }
//}
public class InnerClass {

     class Test {

        String name;
        public Test(String name){
            this.name = name;
        }
    }


    public static void main(String[] args) {

         InnerClass obj = new InnerClass();

        Test a = obj.new Test("Aman");
        Test b = obj.new Test("Rockey");


        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println();
    }
}
