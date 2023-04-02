package part1;

import java.time.DayOfWeek;
import java.util.HashMap;

public class Task12 {
    public static void main(String[] args) {
        int number = DayOfWeek(5);

    }
    public static int DayOfWeek(int number) {
        switch (number) {
            case 1:
                System.out.println("День - понедельник, запланировано идти в университет с 15.50 до 18.20, затем с 18.30 до 21.20 идти на курсы");
                break;
            case 2:
                System.out.println("День - вторник, запланировано идти в тренажерный зал с 9.00 до 12.00, следом нужно сходить на пары с 14.00 до 17.10, ");
                break;
            case 3:
                System.out.println("День - среда, запланировано играть в компьютерные игры с 19.00 до 21.00");
                break;
            case 4:
                System.out.println("День - четверг, запланирован поход на курсы по Java с 18.30 до 21.20");
                break;
            case 5:
                System.out.println("День - пятница, запланирован поход на пары с 9.00 до 13.45, после чего нужно сходить получить паспорт в 15.00");
                break;
            case 6:
                System.out.println("День - суббота, запланированно идти в тренажерный зал с 15.00 до 18.00");
                break;
            case 7:
                System.out.println("День - воскресенье, запалнирован поход в клуб в 24.00");
                break;
        }
        return number;
    }
}
