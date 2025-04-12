package Lambda;

public class LambdaMain {

    public static void main(String[] args) {


//        BankInterface process = new BankInterface() {
//            @Override
//            public int withdraw() {
//                return 100;
//            }
//        };
//
//        System.out.println(process.withdraw());

        BankInterface p2 = (a) -> a + 500;

        System.out.println(p2.withdraw(500));
    }
}
