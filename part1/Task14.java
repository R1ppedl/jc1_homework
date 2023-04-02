package part1;

public class Task14 {
    public static void main(String[] args) {
        int a = 1 ;
        int b = 2 ;
        do {
            int res = a * b;
            System.out.println("Произведение числа " + a + " и числа " + b + " = " + res);
            a++;
        } while (a <=25);

    }
}
