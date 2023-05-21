package part1;

public class Task44 {
    public static void main(String[] args) {
        String k = null;
        try {
            int length = k.length();
        } catch (NullPointerException e) {
            System.out.println(e);;
        } 
    }
}

