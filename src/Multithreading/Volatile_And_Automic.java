package Multithreading;

class SharedResources{
    private volatile boolean flag = false;

    public void setFlag(){
        System.out.println("Writer thread made the flag true");
        flag = true;
    }

    public void printIfFlatTrue(){

        while(!flag){

        }

        System.out.println("Flag is true now : "+flag);
    }
}

public class Volatile_And_Automic {

    public static void main(String[] args) {

        SharedResources sharedResources = new SharedResources();

        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            sharedResources.setFlag();
        });

        Thread readerThread = new Thread(() -> {
            sharedResources.printIfFlatTrue();
        });

        writerThread.start();
        readerThread.start();

    }
}
