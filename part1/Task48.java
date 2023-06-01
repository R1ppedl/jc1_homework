package part1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task48 {
    public static void main(String[] args) {
        String filename = "text.txt";
        String text = "This is a sample sentence. It contains punctuation marks! How many words and punctuation marks are here?";

        // Создаем файл и записываем в него текст
        createFile(filename, text);

        // Читаем файл и подсчитываем количество знаков препинания и слов
        int punctuationCount = 0;
        int wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (isPunctuation(c)) {
                        punctuationCount++;
                    }
                }
                wordCount += line.split("\\s+").length;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Выводим результат на экран
        System.out.println("Количество знаков препинания: " + punctuationCount);
        System.out.println("Количество слов: " + wordCount);
    }

    private static void createFile(String filename, String text) {
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '-';
    }
}


