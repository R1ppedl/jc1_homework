package part1;

import java.util.*;

public class Task41 {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        // заполнение коллекции случайными числами
        for (int i = 0; i < 20; i++) {
            int number = rand.nextInt(10); // случайное число от 0 до 9
            numbers.add(number);
        }

        System.out.println("Изначальная коллекция чисел:");
        System.out.println(numbers);

        // удаление повторяющихся чисел с помощью множества HashSet
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        numbers.clear();
        numbers.addAll(uniqueNumbers);

        System.out.println("Коллекция чисел без повторов:");
        System.out.println(numbers);
    }
}
