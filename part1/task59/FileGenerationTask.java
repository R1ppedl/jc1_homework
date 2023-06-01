package part1.task59;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class FileGenerationTask implements Callable<List<String>> {
    private static final int NUM_FILES = 10;
    private static final int NUM_LINES = 10;
    private static final int MIN_SLEEP_MS = 1000;
    private static final int MAX_SLEEP_MS = 3000;

    private static final ThreadLocal<String> threadName = new ThreadLocal<>();

    @Override
    public List<String> call() throws Exception {
        threadName.set(Thread.currentThread().getName());
        List<String> fileNames = new ArrayList<>();

        for (int i = 0; i < NUM_FILES; i++) {
            String fileName = generateFile();
            fileNames.add(fileName);
        }

        return fileNames;
    }

    private String generateFile() throws InterruptedException {
        Thread.sleep(getRandomSleepTime());

        String fileName = "file_" + threadName.get() + "_" + System.currentTimeMillis() + ".txt";
        System.out.println("Thread: " + threadName.get() + " generated file: " + fileName);

        StringBuilder content = new StringBuilder();
        for (int i = 0; i < NUM_LINES; i++) {
            content.append("Line ").append(i + 1).append("\n");
        }


        return fileName;
    }

    private int getRandomSleepTime() {
        Random random = new Random();
        return random.nextInt(MAX_SLEEP_MS - MIN_SLEEP_MS + 1) + MIN_SLEEP_MS;
    }


}
