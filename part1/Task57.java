package part1;

public class Task57 {
    public static void main(String[] args) {
        // Создаем два объекта-ресурса
        Object resource1 = new Object();
        Object resource2 = new Object();
        Object resource3 = new Object();

        // Создаем первый поток
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Поток 1 получил ресурс 1");

                try {
                    Thread.sleep(100); // Небольшая пауза для демонстрации deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Поток 1 получил ресурс 2");
                }
            }
        });

        // Создаем второй поток
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Поток 2 получил ресурс 2");

                try {
                    Thread.sleep(100); // Небольшая пауза для демонстрации deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource3) {
                    System.out.println("Поток 2 получил ресурс 3");
                }
            }
        });

        // Создаем третий поток
        Thread thread3 = new Thread(() -> {
            synchronized (resource3) {
                System.out.println("Поток 3 получил ресурс 3");

                try {
                    Thread.sleep(100); // Небольшая пауза для демонстрации deadlock
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Поток 3 получил ресурс 1");
                }
            }
        });

        // Запускаем потоки
        thread1.start();
        thread2.start();
        thread3.start();

        // Ожидаем завершения потоков
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

