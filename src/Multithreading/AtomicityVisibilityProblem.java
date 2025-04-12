package Multithreading;

class Shared_Resource {
    private volatile boolean  flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class AtomicityVisibilityProblem {

    public static void main(String[] args) {
        Shared_Resource sharedResource = new Shared_Resource();

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(1000);
                sharedResource.setFlag(true);
                System.out.println("Flag has been set to true.");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        });

        Thread t2 = new Thread(()->{

            while (!sharedResource.isFlag()){
                // It will run until flag become true
            }
        });

        t1.start();
        t2.start();

    }

}
