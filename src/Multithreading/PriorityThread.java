package Multithreading;

public class PriorityThread extends Thread{

    public PriorityThread(String name){
        super(name);
    }
    @Override
    public void run() {

        try{
           for (int i=0; i<5; i++){
               System.out.println(Thread.currentThread().getName() + " - Priority : "+ Thread.currentThread().getPriority() + " - Count : "+ i );
           }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        PriorityThread l = new PriorityThread("Low priority thread");
        PriorityThread m = new PriorityThread("Medium priority thread");
        PriorityThread h = new PriorityThread("High priority thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();

    }

}
