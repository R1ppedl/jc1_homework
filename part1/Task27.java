package part1;

public class Task27 {
    public static void main(String[] args) {
        String s = "!-':;,._{}()*/?";
        String test = "Hello. World!!; I love?u:";
        char z;
        char symbol;
        int k = 0;
        for (int i = 0; i < test.length(); i++) {
            symbol = test.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                z = s.charAt(j);
                if (symbol == z)
                    k++;
            }

        }
        System.out.println("Общее количтесво знаков препинания: " + k);
    }
}
