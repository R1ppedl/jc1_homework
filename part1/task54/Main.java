package part1.task54;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            RandomArrayThread thread = new RandomArrayThread();
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
