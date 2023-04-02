package part1;

public class Task15 {
    public static void main(String[] args) {
        long number = 7893823445L;
        int sum = 0;

        do {
            int digit = (int) (number % 10); // Получаем последнюю цифру числа
            sum += digit; // Добавляем её к общей сумме
            number = number / 10; // Удаляем последнюю цифру из числа
        } while (number > 0);

        System.out.println("Сумма цифр числа 7893823445 равна: " + sum);
    }
}
