package part1;

public class Task5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int result = sumAndPd(a, b);
        System.out.println("Результат: " + result);
    }

    public static int sumAndPd(int a, int b) {
        int sum = a + b;
        int pd = a * b;
        int result = sum + pd;
        return result;
    }
}
