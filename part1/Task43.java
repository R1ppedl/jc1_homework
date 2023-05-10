package part1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();

        String[] words = text.split("\\s+"); // Разделяем текст на слова по пробелам и сохраняем их в массив

        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) { // Если слово уже есть в карте, увеличиваем счетчик на 1
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else { // Если слова еще нет в карте, добавляем его со значением 1
                wordCounts.put(word, 1);
            }
        }

        // Выводим результаты на экран
        System.out.println("Слова и количество повторений:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
