package Multithreading;

public class DemonAndUserThreads {

    public static void main(String[] args) {

        Thread demon = new Thread(new DemonHelper());
        Thread user = new Thread(new UserThreadHelper());

        demon.setDaemon(true);

        demon.start();
        user.start();
    }


}

class DemonHelper implements Runnable {

    @Override
    public void run() {
        int count = 0;

        while(count < 500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            count++;
            System.out.println("Demon helper thread running ... ");
        }
    }
}

class UserThreadHelper implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("User thread done with execution ... ");
    }
}
