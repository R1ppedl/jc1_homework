package part1;

import java.util.regex.*;

public class Task30 {
    public static void main(String[] args) {
        String input = "Это строка, содержащая несколько шестнадцатеричных чисел: 0x1A, 0xABCD, 0x1234EF.";

        Pattern pattern = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Найдено шестнадцатеричное число: " + matcher.group());
        }
    }
}

