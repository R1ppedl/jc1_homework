package part1.task58;

import java.util.Random;

class Producer implements Runnable {
    private Queue queue;
    private Random random;

    public Producer(Queue queue) {
        this.queue = queue;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (Main.processedItems < 10000) {
            synchronized (queue) {
                while (queue.size() >= 100) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int item = random.nextInt(100) + 1;
                queue.add(item);
                Main.processedItems++;

                if (queue.size() <= 80) {
                    queue.notifyAll();
                }
            }
        }
    }
}