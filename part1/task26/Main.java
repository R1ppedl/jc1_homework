package part1.task26;

import part1.task25.Task25;

public class Main {
    public static void main(String[] args) {
        Task26 atm = new Task26(10, 5, 2); // Создаем банкомат с начальным количеством купюр

        atm.addCount20(2); // Добавляем деньги в банкомат
        atm.addCount50(1);
        atm.addCount100(1);

        boolean success = atm.withdrawMoney(600); // Пытаемся снять 370 рублей
        if (success) {
            System.out.println("Операция удалась");
        } else {
            System.out.println("Операция не удалась");
        }

    }
}
