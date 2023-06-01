package part1;

import java.io.*;
import java.util.*;

public class Task51 {
    public static void main(String[] args) {
        String rootDirectory = "C:/work/first_dz/src/part1/task51/";

        // Создание трех папок
        String folder1 = rootDirectory + "Folder1/";
        String folder2 = folder1 + "Folder2/";
        String folder3 = folder2 + "Folder3/";

        createDirectory(folder1);
        createDirectory(folder2);
        createDirectory(folder3);

        // Создание 5 текстовых файлов с произвольными числами
        createTextFiles(folder3, 5);

        // Запись содержимого файлов в один файл
        String outputFile = folder3 + "CombinedFile.txt";
        combineTextFiles(folder3, outputFile);

        // Создание файла, содержащего список файлов данного каталога
        String fileListFile = folder3 + "FileList.txt";
        createFileList(folder3, fileListFile);

        System.out.println("Операции выполнены успешно.");
    }

    // Метод для создания директории
    private static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Создана директория: " + directoryPath);
            } else {
                System.out.println("Не удалось создать директорию: " + directoryPath);
            }
        }
    }

    // Метод для создания текстовых файлов с произвольными числами
    private static void createTextFiles(String directoryPath, int numFiles) {
        Random random = new Random();
        for (int i = 1; i <= numFiles; i++) {
            String filePath = directoryPath + "File" + i + ".txt";
            try (PrintWriter writer = new PrintWriter(filePath)) {
                for (int j = 0; j < 10; j++) {
                    int randomNumber = random.nextInt(100);
                    writer.println(randomNumber);
                }
                System.out.println("Создан файл: " + filePath);
            } catch (FileNotFoundException e) {
                System.out.println("Не удалось создать файл: " + filePath);
            }
        }
    }

    // Метод для объединения содержимого текстовых файлов в один файл
    private static void combineTextFiles(String directoryPath, String outputFile) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (File file : files) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка при чтении файла: " + file.getAbsolutePath());
                }
            }
            System.out.println("Создан объединенный файл: " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + outputFile);
        }
    }

    // Метод для создания файла, содержащего список файлов данного каталога
    private static void createFileList(String directoryPath, String fileListFile) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        try (PrintWriter writer = new PrintWriter(fileListFile)) {
            for (File file : files) {
                writer.println(file.getName());
            }
            System.out.println("Создан файл со списком файлов: " + fileListFile);
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + fileListFile);
        }
    }
}
