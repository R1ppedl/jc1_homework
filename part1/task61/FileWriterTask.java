package part1.task61;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;

public class FileWriterTask implements Callable<Void> {
    private static final Object lock = new Object(); // Объект блокировки для синхронизации

    @Override
    public Void call() {
        String threadName = Thread.currentThread().getName();
        String message = "Hello World " + LocalDateTime.now();

        synchronized (lock) { // Блокируем доступ к файлу для одного потока
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/part1/task61/hello", true))) {
                writer.write("Thread: " + threadName + ", Message: " + message + "\n");
                System.out.println("Thread: " + threadName + " wrote message to file.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}

