package part1;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            int grade = random.nextInt(10) +1;
            arrayList.add(grade);
        }
        System.out.println("Изначальный список оценок учеников:");
        System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        int TheHighestMark = 0;
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade > TheHighestMark) {
                TheHighestMark = grade;
            }
        }
        System.out.println("Наивысшая оценка: " + TheHighestMark);
    }
}
