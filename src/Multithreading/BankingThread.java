package Multithreading;

public class BankingThread implements Runnable{

    BankAccount sbi = new BankAccount();

    @Override
    public void run() {
        try {
            sbi.withdraw(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
