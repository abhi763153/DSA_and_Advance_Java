package String;

public class ThreadSaftyOnString {

    public static StringBuilder  sb = new StringBuilder();

    public static void main(String[] args) {


        Thread t1 = new Thread(){

            @Override
            public void run(){
                for(int i=0; i<1000; i++){
                    sb.append("A");
                }
            }
        };

        Thread t2 = new Thread(){

            @Override
            public void run(){
                for(int i=0; i<1000; i++){
                    sb.append("B");
                }
            }
        };

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(sb.length());
    }
}
