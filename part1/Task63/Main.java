package part1.Task63;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Генерируем группу из 100 человек
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String name = "Name" + i;
            String surname = "Surname" + i;
            int age = 15 + (int) (Math.random() * 16); // Случайный возраст от 15 до 30
            people.add(new Person(name, surname, age));
        }

        List<String> result = people.stream()
                .filter(person -> person.getAge() < 21) // Фильтруем по возрасту меньше 21
                .peek(person -> System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAge())) // Выводим на экран
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName)) // Сортируем по фамилии, а потом по имени
                .limit(4) // Берем 4 первых объекта
                .map(Person::getSurname) // Получаем фамилии объектов
                .collect(Collectors.toList()); // Собираем в коллекцию

        // Выводим результат
        System.out.println("Результат:");
        for (String surname : result) {
            System.out.println(surname);
        }
    }
}