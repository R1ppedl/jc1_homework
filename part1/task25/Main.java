package part1.task25;

public class Main {
    public static void main(String[] args) {
        Task25 time1 = new Task25(3661);
        Task25 time2 = new Task25(1, 1, 1);

        System.out.println("Time 1:");
        time1.printTime();
        System.out.println("Общее количество секунд: " + time1.getTotalSeconds());

        System.out.println("\nTime 2:");
        time2.printTime();
        System.out.println("Общее количество секунд: " + time2.getTotalSeconds());

        int result = time1.compareTo(time2);
        if (result < 0) {
            System.out.println("\nВремя 1 меньше, чем время 2");
        } else if (result > 0) {
            System.out.println("\nВремя 1 больше, чем время 2");
        } else {
            System.out.println("\nВремя 1 равно времени 2");
        }
    }
}
