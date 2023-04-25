package part1.task33;

public class Microwave extends Kettle {
    private int mod;

    public Microwave(int wat, boolean isMealCooked, int mod) {
        super(wat, isMealCooked);
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }
    public boolean doAction() {
        System.out.println("Колличестово вват микроволновки: " + wat + ", готовность блюда: " + isMealCooked + ", режим микроволновки");
        return true;
    }
}
