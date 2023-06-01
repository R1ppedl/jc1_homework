package part1.task61;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Пул из 3 потоков

        for (int i = 0; i < 10; i++) {
        executor.submit(new FileWriterTask());
        }

        executor.shutdown();
    }
}

