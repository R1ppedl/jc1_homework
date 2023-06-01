package part1.task58;

public class Queue {
    private static final int CAPACITY = 200;
    private int[] items;
    private int size;

    public Queue() {
        this.items = new int[CAPACITY];
        this.size = 0;
    }

    public synchronized void add(int item) {
        items[size++] = item;
    }

    public synchronized int remove() {
        int item = items[0];
        System.arraycopy(items, 1, items, 0, --size);
        return item;
    }

    public synchronized int size() {
        return size;
    }

    public synchronized boolean isEmpty() {
        return size == 0;
    }
}

