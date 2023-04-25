package part1.task33;

public class Heater {
    public int wat;
    protected boolean isOn;
    public Heater(int wat) {
        this.wat = wat;
    }

    public int getWat() {
        return wat;
    }

    public void setWat(int wat) {
        this.wat = wat;
    }
    public boolean doAction() {
        System.out.println("Колличестово вват нагревателя: " + wat);
        return true;
    }
    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println( "Device is now turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Device is now turned off.");
    }
}
