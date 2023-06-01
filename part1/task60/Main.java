package part1.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        // Создаем пул из 3 потоков
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            // Создаем и добавляем задачу в пул
            Callable<String> task = new RandomSumTask();
            Future<String> result = executorService.submit(task);
            results.add(result);
        }

        // Обрабатываем результаты выполнения задач
        for (int i = 0; i < 10; i++) {
            try {
                // Получаем результат задачи
                String sum = results.get(i).get();
                System.out.println("Результат выполнения задачи " + i + ": " + sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Завершаем работу пула потоков
        executorService.shutdown();
    }
}
