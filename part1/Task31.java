package part1;

import java.util.regex.*;

public class Task31 {
    public static void main(String[] args) {
        String input = "Это строка с тегами <p>, <p id=\"p1\"> и <p class=\"test\">.";
        String result = replaceParagraphTags(input);
        System.out.println(result);
    }

    public static String replaceParagraphTags(String input) {
        Pattern pattern = Pattern.compile("<p(\\s+[^>]*)?>");
        Matcher matcher = pattern.matcher(input);
        String result = matcher.replaceAll("<p>");
        return result;
    }
}