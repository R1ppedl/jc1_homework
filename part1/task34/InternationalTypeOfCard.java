package part1.task34;

public class InternationalTypeOfCard {
    public boolean isVisa ;

    public InternationalTypeOfCard(boolean isVisa) {
        this.isVisa = isVisa;
    }
    public void cardSettings() {
        if (isVisa)
            System.out.println("данная карта типа Visa");
        else
            System.out.println("данная карта типа Mastercard");
    }
    public boolean isVisa() {
        return isVisa;
    }

    public void setVisa(boolean visa) {
        isVisa = visa;
    }

    public boolean doAction() {
        System.out.println("Колличестово вват нагревателя: " + isVisa);
        return true;
    }

}
