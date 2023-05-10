package part1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task40 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayList = new ArrayList(10);
        int grade;
        for (int i = 0; i < 10; i++) {
             grade = random.nextInt(10) +1;
            arrayList.add(grade);
        }
        System.out.println("Изначальный список оценок учеников:");
        System.out.println(arrayList);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i) < 5) {
                arrayList.remove(i);
            }
        }
        System.out.println("Список оценок учеников без неудовлетворительных оценок:");
        System.out.println(arrayList);
    }
}
