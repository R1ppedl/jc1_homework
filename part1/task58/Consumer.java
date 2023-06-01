package part1.task58;

class Consumer implements Runnable {
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (Main.processedItems < 10000) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int item = queue.remove();
                System.out.println("Consumer consumed: " + item);
                Main.processedItems++;

                if (queue.size() >= 100) {
                    queue.notifyAll();
                }
            }
        }
    }
}
