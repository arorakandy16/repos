package Multithreading;

import java.util.concurrent.*;

public class Q7 {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newCachedThreadPool();
        Future<Integer> future = ex.submit(new Callable<Integer>()
        {
            @Override
            public Integer call() throws Exception {
                System.out.println("Starting...");
                Thread.sleep(1000);
                System.out.println("Finished...");
                return 10;
            }
        });
        ex.shutdown();

        try {
            System.out.println("Result is "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
