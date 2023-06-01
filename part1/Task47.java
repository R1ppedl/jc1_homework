package part1;

import java.io.File;

public class Task47 {
    public static void main(String[] args) {
        String directoryPath = "src/part1";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            System.out.println("Список файлов:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }

            System.out.println("\nСписок каталогов:");
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Указанный путь не является действительным каталогом.");
        }
    }
}

