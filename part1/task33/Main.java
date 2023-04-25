package part1.task33;

public class Main {
    public static void main(String[] args) {
        Heater heater1 = new Heater(220);
        heater1.doAction();
        heater1.turnOn();
        Heater heater2 = new Heater(120);
        heater2.doAction();
        heater2.turnOn();
        Heater heater3 = new Heater(250);
        heater3.doAction();
        heater3.turnOff();
        Kettle kettle1 = new Kettle(300, true);
        kettle1.doAction();
        kettle1.turnOff();
        Kettle kettle2 = new Kettle(350, false);
        kettle2.doAction();
        kettle2.turnOn();
        Kettle kettle3 = new Kettle(330, true);
        kettle3.doAction();
        kettle3.turnOff();
        Microwave microwave1 = new Microwave(400, false, 3);
        microwave1.doAction();
        microwave1.turnOn();
        Microwave microwave2 = new Microwave(440, true, 2);
        microwave2.doAction();
        microwave2.turnOff();
        Microwave microwave3 = new Microwave(370, true, 5);
        microwave3.doAction();
        microwave3.turnOn();
    }
}
