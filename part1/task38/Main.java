package part1.task38;

import part1.task36.SeasonsOfYear;

public class Main {
    public static void main(String[] args) {
        part1.task38.SeasonsOfYear season = part1.task38.SeasonsOfYear.SPRING;
        int days = season.getDays();
        System.out.println("Days in " + season + ": " + days);
    }
}
