package part1;

import java.util.stream.IntStream;

public class Task62 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20)
                .filter(n -> n % 2 == 0)
                .forEach(n -> {
                    System.out.println(n + " дюйм = " + convertToCentimeters(n) + " сантиметров");
                });

        double sumInCentimeters = IntStream.rangeClosed(1, 20)
                .filter(n -> n % 2 == 0)
                .mapToDouble(Task62::convertToCentimeters)
                .sum();
        System.out.println("Сумма в сантиметрах: " + sumInCentimeters);
    }

    private static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }
}

