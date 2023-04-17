package part1;

public class Task28 {
    public static void main(String[] args) {
        String test = "  Добрый вечер я  диспетчер  ";
        String test1 = test.trim();
        int a = test1.split("\\s+").length;
        System.out.println("Количество слов в тексте: " + a);
        }
}
