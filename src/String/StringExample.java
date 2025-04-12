package String;

public class StringExample {

    public static void main(String[] args) {

        String x = "Ram";
        String a = new String(x);
        String b = new String(x);

        String c = "Ram";
        String d = "Ram";

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(a == c);
        System.out.println(x == d);
    }
}
