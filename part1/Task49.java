package part1;

import java.io.*;
import java.util.*;

public class Task49 {
    public static void main(String[] args) {
        // Создаем файл с текстом, в котором присутствуют числа
        createTextFile("Task49.numbers.txt");

        // Читаем файл и находим все числа
        List<Integer> numbers = readNumbersFromFile("numbers.txt");

        // Выводим все числа на экран
        System.out.print("Числа в файле: ");
        printNumbers(numbers);

        // Считаем сумму чисел
        int sum = calculateSum(numbers);
        System.out.println("Сумма чисел: " + sum);

        // Убираем повторяющиеся числа
        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        // Выводим уникальные числа на экран
        System.out.print("Уникальные числа: ");
        printNumbers(uniqueNumbers);
    }

    // Метод для создания файла с текстом, в котором присутствуют числа
    private static void createTextFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Цифра 20 очень любит праздники, в то время как цифра 5 учится в школе. Не стоит забывать и 25 цифре. Однако если цифра 5 повторится, прийдется ее удаоить.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для чтения чисел из файла
    private static List<Integer> readNumbersFromFile(String filename) {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    // Метод для вывода чисел на экран
    private static void printNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Метод для вычисления суммы чисел
    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Метод для удаления повторяющихся чисел
    private static List<Integer> removeDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbers);
    }
}

