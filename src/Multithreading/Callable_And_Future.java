package Multithreading;

import java.util.concurrent.*;

public class Callable_And_Future {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        try(ExecutorService service = Executors.newFixedThreadPool(2)){

            Future<Integer> future = service.submit(new CalculateMultiplication());

//            future.cancel(true);

            try {
                System.out.println(future.get(6000, TimeUnit.MILLISECONDS));
            } catch (TimeoutException e) {
                throw new RuntimeException(e);
            }

            System.out.println(future.isCancelled());

            service.shutdown();

//        System.out.println(service.awaitTermination(3000, TimeUnit.MILLISECONDS));

            System.out.println("Main thread completed!");
        }

    }
}


class CalculateMultiplication implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        return 7*6;
    }
}