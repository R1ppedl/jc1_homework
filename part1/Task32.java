package part1;

public class Task32 {
    public static void main(String[] args) {
        long startTime, endTime, duration;

        // Цикл с помощью оператора сложения и String
        startTime = System.currentTimeMillis();
        String result1 = "";
        for (int i = 0; i < 1000000; i++) {
            result1 += "aaabbbccc";
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Время выполнения цикла со строками и оператором сложения: " + duration + " мс");

        // Цикл с помощью StringBuilder и метода append
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("aaabbbccc");
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Время выполнения цикла со StringBuilder и методом append: " + duration + " мс");
    }
}

