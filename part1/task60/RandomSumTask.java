package part1.task60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;




class RandomSumTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Получаем имя текущего потока
        String threadName = Thread.currentThread().getName();

        // Генерируем коллекцию из 10 рандомных целых чисел
        List<Integer> numbers = generateRandomNumbers();

        // Засыпаем на случайное время от 1 до 10 секунд
        int sleepTime = new Random().nextInt(10) + 1;
        Thread.sleep(sleepTime * 1000);

        // Вычисляем сумму чисел
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Возвращаем сумму в виде строки
        return "Поток " + threadName + " завершил работу. Сумма чисел: " + sum;
    }

    private List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }
}
