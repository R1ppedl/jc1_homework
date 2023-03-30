package part1;

public class Task6 {
    public static void main(String[] args) {

        int totalSeconds = 5000;
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        int totalHours = totalMinutes / 60;
        int hours = totalHours % 24;
        int totalDays = totalHours / 24;
        int days = totalDays % 7;
        int weeks = totalDays / 7;

        System.out.printf("Промежуток времени: " + weeks + " недель " + days + " дней " + hours + " часов " + minutes + " минут " + seconds + " секунд ");
    }
}