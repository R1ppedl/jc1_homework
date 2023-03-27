package part1;

public class Task6 {
    public static void main(String[] args) {

        int seconds = 5000;

        float minutes = seconds / 60;

        float hours = minutes / 60;

        float days = hours / 24;

        float weeks = days / 7;

        System.out.println(weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд ");
    }
}
