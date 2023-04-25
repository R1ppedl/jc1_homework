package part1.task34;

public class BankCard extends InternationalTypeOfCard{
    public String bankName;

    public BankCard(boolean isVisa, String bankName) {
        super(isVisa);
        this.bankName = bankName;
    }
    public void cardSettings() {
        if (isVisa)
            System.out.println("данная карта типа Visa, название банка - " + bankName);
        else
            System.out.println("данная карта типа Mastercard, название банка - " + bankName);

    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
