package part1;

public class Task9 {
    public static void main(String[] args) {
                int money = 0;

                String rubles;

                int lastDigit = money % 10;
                int lastTwoDigits = money % 100;

                if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
                    rubles = "рублей";
                } else if (lastDigit == 1) {
                    rubles = "рубль";
                } else if (lastDigit >= 2 && lastDigit <= 4) {
                    rubles = "рубля";
                } else {
                    rubles = "рублей";
                }

                System.out.println(money + " " + rubles);
            }
        }
