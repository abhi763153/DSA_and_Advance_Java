package Multithreading;

public class DeadLockDemo {

    private static final Object account = new Object();
    private static final Object transaction = new Object();

    public static void main(String[] args) {

        Thread DebitCard = new Thread(()->{

            synchronized (account){
                System.out.println("Thread DebitCard : Holding account object.");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread DebitCard : before holding transaction object.");

                synchronized (transaction){
                    System.out.println("Thread DebitCard : Holding account and transaction object.");
                }
            }


        }, "DebitCard Thread");

        Thread OnlinePayment = new Thread(()->{

            synchronized (transaction){
                System.out.println("Thread OnlinePayment : Holding transaction object.");
                try {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread OnlinePayment : before holding account object.");

                synchronized (account){
                    System.out.println("Thread OnlinePayment : Holding account and transaction object.");
                }
            }
        }, "Online payment thread");

        DebitCard.start();
        OnlinePayment.start();

        while (true){
            if(DebitCard.getState() == Thread.State.BLOCKED && OnlinePayment.getState() == Thread.State.BLOCKED){
                System.out.println("DeadLock thread : "+ DebitCard.getName() + " and "+ OnlinePayment.getName());
                break;
            }
        }

    }
}
