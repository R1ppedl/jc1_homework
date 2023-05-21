package part1.Task45;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws MyException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы: ");
        int group = scanner.nextInt();

        if (group < 1 || group > 2) throw new MyException("There are only 2 groups. You must chose only 1 or 2!", group);

        if (group == 1) {
            for (int studentId = 1; studentId <= 30; studentId++) {
                System.out.println("Student " + studentId + " mark: " + random.nextInt(10));
            }
        }
        if (group == 2) {
            for (int studentId = 1; studentId <= 25; studentId++) {
                System.out.println("Student " + studentId + " mark: " + random.nextInt(10));
            }
        }
    }
}
