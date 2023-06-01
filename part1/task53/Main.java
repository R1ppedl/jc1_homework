package part1.task53;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Double>> results = new ArrayList<>();

        Random random = new Random();

        // Создаем и запускаем 10 потоков
        for (int i = 0; i < 10; i++) {
            List<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                numbers.add(random.nextInt(100));
            }
            Callable<Double> task = new AverageCalculator(numbers);
            Future<Double> result = executor.submit(task);
            results.add(result);
        }

        // Получаем результаты и выводим на экран
        for (Future<Double> result : results) {
            try {
                double average = result.get();
                System.out.println("Среднее арифметическое: " + average);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Останавливаем ExecutorService
        executor.shutdown();
    }
}
