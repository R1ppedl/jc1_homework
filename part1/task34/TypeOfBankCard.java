package part1.task34;

public class TypeOfBankCard extends BankCard{
    public String model;

    public TypeOfBankCard(boolean isVisa, String bankName, String model) {
        super(isVisa, bankName);
        this.model = model;
    }
    public void cardSettings() {
        if (isVisa)
            System.out.println("данная карта типа Visa, название банка - " + bankName + ", модель карты - " + model);
        else
            System.out.println("данная карта типа Mastercard, название банка - " + bankName + ", модель карты - " + model);
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
