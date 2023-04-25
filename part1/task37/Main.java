package part1.task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий сезон: ");
        SeasonsOfYear currentSeason = SeasonsOfYear.valueOf(scanner.nextLine().toUpperCase());
        SeasonsOfYear nextSeason = getNextSeason(currentSeason);
        System.out.println("Следующий сезон: " + nextSeason);
    }

    public static SeasonsOfYear getNextSeason(SeasonsOfYear currentSeason) {
        switch (currentSeason) {
            case WINTER:
                return SeasonsOfYear.SPRING;
            case SPRING:
                return SeasonsOfYear.SUMMER;
            case SUMMER:
                return SeasonsOfYear.AUTUMN;
            case AUTUMN:
                return SeasonsOfYear.WINTER;
            default:
                throw new IllegalArgumentException("Неизвестный сезон");
        }
    }
}