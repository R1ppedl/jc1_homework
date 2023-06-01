package part1.task55;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            FileThread thread = new FileThread("src/part1/task55/file" + i + ".txt");
            thread.start();
        }
    }
}