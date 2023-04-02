package part1;

public class Task16 {
    public static void main(String[] args) {
        int c = 0;
        int i;
        int k = 0;
        for (i = 50; i < 70; i++) {
            for (int j = 2; j <= i; j++){
                
                if (i % j == 0)
                    c++;

            }
            if (c == 1){
                k++;
                System.out.println("Простое число номер " + k + " = " + i);
            }
            else
                c = 0;
            if (k == 2)
                break;
        }
    }
}
