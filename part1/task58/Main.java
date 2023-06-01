package part1.task58;

public class Main {
    public static int processedItems = 0;

    public static void main(String[] args) {
        Queue queue = new Queue();

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);
        Producer producer3 = new Producer(queue);

        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);

        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        Thread producerThread3 = new Thread(producer3);

        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        producerThread1.start();
        producerThread2.start();
        producerThread3.start();

        consumerThread1.start();
        consumerThread2.start();
    }
}
