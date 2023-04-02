package part1;

public class Task7 {
    public static void main(String[] args) {
        int a = 23233;
        boolean yesLastDigitSeven = isLastDigitSeven(a);
        System.out.println(yesLastDigitSeven);

    }

    public static boolean isLastDigitSeven(int k) {
        return k % 10 == 7;
    }
}
