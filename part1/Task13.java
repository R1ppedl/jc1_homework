package part1;

public class Task13 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            int factorial = 1;
            int j = 1;
            while (j <= i) {
                factorial *= j;
                j++;
            }
            System.out.println(i + "! = " + factorial);
            i++;
        }
    }
}
