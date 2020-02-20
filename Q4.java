package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i += 2) {
                    System.out.println("Even: " + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 20; i += 2) {
                    System.out.println("Odd: " + i);
                }
            }
        });
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.submit(t1);
        e.submit(t2);
        e.shutdown();

    }
}
