package part1;
import java.util.Random;

public class Task19 {
    public static void main(String[] args) {
        int[] m = new int[10];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(100);
        }
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + " ");
        System.out.println();
        System.out.println("Последний элемент массива: " + m[m.length-1] );
    }
}
