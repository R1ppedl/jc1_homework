package part1;

public class Task18 {
        public static void main(String[] args) {
            int number = 123456789;
            String result = "";
            int count = 0;

            while (number > 0) {
                int digit = number % 10;
                result = digit + result;
                count++;

                if (count % 3 == 0 && number >= 10) {
                    result = " " + result;
                }

                number /= 10;
            }

            System.out.println(result);
    }

}

