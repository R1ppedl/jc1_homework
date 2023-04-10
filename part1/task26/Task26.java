package part1.task26;

public class Task26 {
    private int num20;
    private int num50;
    private int num100;

    public Task26(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public void addMoney(int num20, int num50, int num100) {
        this.num20 += num20;
        this.num50 += num50;
        this.num100 += num100;
    }
    public void addCount20(int num20) {
        this.num20 += num20;
    }
    public void addCount50(int num50) {
        this.num50 += num50;
    }
    public void addCount100(int num100) {
        this.num100 += num100;
    }
    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;
        int num100s = Math.min(remainingAmount / 100, num100);
        remainingAmount -= num100s * 100;
        int num50s = Math.min(remainingAmount / 50, num50);
        remainingAmount -= num50s * 50;
        int num20s = Math.min(remainingAmount / 20, num20);
        remainingAmount -= num20s * 20;

        if (remainingAmount > 0) {
            return false; // не удалось снять всю сумму
        }

        String count100;

        int lastDigit100 = num100s % 10;
        int lastTwoDigits100 = num100s % 100;

        if (lastTwoDigits100 >= 11 && lastTwoDigits100 <= 14) {
            count100 = "купюр";
        } else if (lastDigit100 == 1) {
            count100 = "купюра";
        } else if (lastDigit100 >= 2 && lastDigit100 <= 4) {
            count100 = "купюры";
        } else {
            count100 = "купюр";
        }
        String count50;

        int lastDigit50 = num50s % 10;
        int lastTwoDigits50 = num50s % 100;

        if (lastTwoDigits50 >= 11 && lastTwoDigits50 <= 14) {
            count50 = "купюр";
        } else if (lastDigit50 == 1) {
            count50 = "купюра";
        } else if (lastDigit50 >= 2 && lastDigit50 <= 4) {
            count50 = "купюры";
        } else {
            count50 = "купюр";
        }

        String count20;

        int lastDigit20 = num20s % 10;
        int lastTwoDigits20 = num20s % 100;

        if (lastTwoDigits20 >= 11 && lastTwoDigits20 <= 14) {
            count20 = "купюр";
        } else if (lastDigit20 == 1) {
            count20 = "купюра";
        } else if (lastDigit20 >= 2 && lastDigit20 <= 4) {
            count20 = "купюры";
        } else {
            count20 = "купюр";
        }
        // Удалось снять сумму. Выдаем купюры и обновляем количество в банкомате
        System.out.printf("Выдано %d "+ count100 + " номиналом 100, %d " + count50 + " номиналом 50 и %d " + count20 + " номиналом 20\n",
                num100s, num50s, num20s);
        num100 -= num100s;
        num50 -= num50s;
        num20 -= num20s;
        return true;
    }
}

