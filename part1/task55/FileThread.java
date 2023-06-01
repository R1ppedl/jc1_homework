package part1.task55;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileThread extends Thread {
    private String fileName;

    public FileThread(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            int[] randomArray = generateRandomArray();
            writeArrayToFile(randomArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int[] generateRandomArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }

    private void writeArrayToFile(int[] array) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < array.length; i++) {
            writer.write(String.valueOf(array[i]));
            writer.newLine();
        }

        writer.close();
    }
}


