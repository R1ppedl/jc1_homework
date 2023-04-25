package part1.task34;

public class Main {
    public static void main(String[] args) {
        InternationalTypeOfCard internationalCard1 = new InternationalTypeOfCard(true);
        System.out.print("Информация о карте internationalCard1: " );
        internationalCard1.cardSettings();
        InternationalTypeOfCard internationalCard2 = new InternationalTypeOfCard(false);
        System.out.print("Информация о карте internationalCard2: " );
        internationalCard2.cardSettings();
        BankCard alfaBank = new BankCard(false, "Альфа-Банк");
        System.out.print("Информация о карте Алфа-Банк: " );
        alfaBank.cardSettings();
        TypeOfBankCard belarusBank = new TypeOfBankCard(true, "BelarusBank", "Gold");
        System.out.print("Информация о карте БеларусьБанк: " );
        belarusBank.cardSettings();
    }
}
