package part1;

public class Task10 {
    public static void main(String[] args) {
        int day = 31;
        int month = 1;
        int year = 2005;
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
            System.out.println("Введена некорректная дата!");
            return;
        }
        int daysInMonth;
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                daysInMonth = 29; // Високосный год
            } else {
                daysInMonth = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }
        if (day > daysInMonth) {
            System.out.println("Введенный день не соответствует выбранному месяцу!");
            return;
        }
        int nextDay, nextMonth, nextYear;
        if (day < daysInMonth) {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        } else {
            nextDay = 1;
            if (month == 12) {
                nextMonth = 1;
                nextYear = year + 1;
            } else {
                nextMonth = month + 1;
                nextYear = year;
            }
        }
        System.out.printf("Следующий день: " + nextDay + "." + nextMonth +  "." + nextYear);
    }
}
