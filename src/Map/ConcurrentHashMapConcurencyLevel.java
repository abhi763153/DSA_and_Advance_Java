package Map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapConcurencyLevel {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(20, 0.75f, 4);

        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i=1; i<=4; i++){
            final int threadId = i;
            service.execute(()->{
                for (int j=1; j<=5; j++){
                    String key = "Thread -"+ threadId + "-key-"+j;
                    map.put(key, j);
                    System.out.println(Thread.currentThread().getName()+ " added "+ key);
                }
            });

        }

        service.shutdown();
        while(!service.isTerminated()){
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}
