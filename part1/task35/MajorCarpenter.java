package part1.task35;

public class MajorCarpenter extends Carpenter implements  FactorySalary{
    protected int amountOfWorkers;

    public MajorCarpenter(int cex, int hours, int rateSalary, int valueOfProduction, int category, int amountOfWorkers) {
        super(cex, hours, rateSalary, valueOfProduction, category);
        this.amountOfWorkers = amountOfWorkers;
    }

    public int hourSalary(){
        int hourSalary;
        hourSalary = rateSalary * hours;
        return hourSalary;
    }
    public int percentSalary() {
        int percentSalary;
        percentSalary = 25 * valueOfProduction / 100;
        return percentSalary;
    }
    public int mixedSalary() {
        int mixedSalary;
        mixedSalary = hourSalary() + percentSalary();
        return mixedSalary;
    }
}
