package Multithreading.ExecutorFramwork;

import javax.crypto.spec.PSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveTask {


    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();

        try (ExecutorService service = Executors.newFixedThreadPool(cores)) {

            System.out.println("Created thread pool with : " + cores + " cores.");

            for (int i = 0; i < cores; i++) {
                service.execute(new CpuTask(80));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

class CpuTask implements Runnable{
    private int n;

    public CpuTask(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        long ans = fib(this.n);
        System.out.println(ans);
    }
    public static long fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
