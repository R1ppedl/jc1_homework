package part1.task25;

public class Task25 {
    private int hours;
    private int minutes;
    private int seconds;

    // Конструктор, принимающий общее количество секунд
    public Task25(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }

    // Конструктор, принимающий часы, минуты и секунды по отдельности
    public Task25(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Метод для получения полного количества секунд в объекте
    public int getTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Метод для сравнения двух объектов
    public int compareTo(Task25 other) {
        if (this.getTotalSeconds() < other.getTotalSeconds()) {
            return -1;
        } else if (this.getTotalSeconds() > other.getTotalSeconds()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Метод для вывода данных
    public void printTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

}

