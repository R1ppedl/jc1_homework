package part1;
import java.util.Random;

public class Task21 {
    public static void main(String[] args) {
        int[] m = new int[10];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(100);
        }
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] +" ");
        System.out.println();
        int max = m[0];
        int k=0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                k = i;
            }
        }
        System.out.println("Индекс самого большого числа: " + k);
    }
}
