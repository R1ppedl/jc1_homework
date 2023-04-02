package part1;

public class Task11 {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 15;
        int d = 25;
        int e = 30;
        int f = 40;

        // Проверяем, помещается ли первый дом
        if ((a <= e && b <= f) || (b <= e && a <= f)) {
            System.out.println("Первый дом помещается на участке");
        } else {
            System.out.println("Первый дом не помещается на участке");
        }

        // Проверяем, помещается ли второй дом
        if ((c <= e && d <= f) || (d <= e && c <= f)) {
            System.out.println("Второй дом помещается на участке");
        } else {
            System.out.println("Второй дом не помещается на участке");
        }
    }
}

