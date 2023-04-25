package part1.task33;

public class Kettle extends Heater {
    public boolean isMealCooked;

    public Kettle(int wat, boolean isMealCooked) {
        super(wat);
        this.isMealCooked = isMealCooked;
    }

    public boolean isMealCooked() {
        return isMealCooked;
    }

    public void setMealCooked(boolean mealCooked) {
        isMealCooked = mealCooked;
    }
    public boolean doAction() {
        System.out.println("Колличестово вват чайника: " + wat + ", готовность блюда: " + isMealCooked);
        return true;
    }
}
