package part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task64 {
    public static void main(String[] args) {
        int p = 10;
        int minValue = 1;
        int maxValue = 100;

        // Генерация списка целых чисел
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < p; i++) {
            int number = random.nextInt(maxValue - minValue + 1) + minValue;
            numbers.add(number);
        }

        // Проверка наличия чисел, делящихся и на 3, и на 5
        boolean containsDivisibleBy3And5 = numbers.stream()
                .anyMatch(num -> num % 3 == 0 && num % 5 == 0);
        

        System.out.println("Сгенерированная коллекция чисел: " + numbers);
        System.out.println("Наличие чисел, делящихся на 3 и 5: " + containsDivisibleBy3And5);
    }
}

