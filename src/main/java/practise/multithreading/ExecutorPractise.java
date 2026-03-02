package practise.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorPractise {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            try {
                Thread.sleep(1000);
                return 10;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        if(!future.isDone()){
            System.out.println("still running...");
        }
        System.out.println(future.get());
        executor.shutdown();
    }
}
