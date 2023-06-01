package part1;

import java.io.*;
import java.util.Random;

public class Task50 {
    public static void main(String[] args) {
        // Генерируем 20 случайных чисел
        Random random = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }

        // Записываем числа в двоичный файл
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Task50.numbers.bin"))) {
            for (int number : numbers) {
                outputStream.writeInt(number);
            }
            System.out.println("Числа успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Считываем числа из двоичного файла и выводим их на экран
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("numbers.bin"))) {
            int sum = 0;
            System.out.print("Числа из файла: ");
            for (int i = 0; i < numbers.length; i++) {
                int number = inputStream.readInt();
                System.out.print(number + " ");
                sum += number;
            }
            System.out.println();
            double average = (double) sum / numbers.length;
            System.out.println("Среднее арифметическое: " + average);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

