package part1.task59;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int numThreads = 3;
        int numTasks = 10;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < numTasks; i++) {
            FileGenerationTask task = new FileGenerationTask();
            Future<List<String>> future = executor.submit(task);
            futures.add(future);
        }

        for (Future<List<String>> future : futures) {
            List<String> fileNames = future.get();
            System.out.println("Generated files: " + fileNames);
        }

        executor.shutdown();
    }
}
