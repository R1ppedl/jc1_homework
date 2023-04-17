package part1;

public class Task29 {
    public static void main(String[] args) {
        String test = "  Добрый вечер я  диспетчер  ";
        String test1 = test.trim();
        String[] words = test1.split("\\s+");
        StringBuilder lastLetters = new StringBuilder();
        for (String word: words) {
            char lastLetter = word.charAt(word.length() - 1);
            lastLetters.append(lastLetter);
        }
        System.out.println(lastLetters);

    }
}
