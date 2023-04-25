package part1.task35;

public class Carpenter extends FactoryWorker implements FactorySalary{
    public int category;

    public Carpenter(int cex, int hours, int rateSalary, int valueOfProduction, int category) {
        super(cex, hours, rateSalary, valueOfProduction);
        this.category = category;
    }

    public int hourSalary(){
        int hourSalary;
        hourSalary = rateSalary * hours;
        return hourSalary;
    }
    public int percentSalary() {
        int percentSalary;
        percentSalary = 15 * valueOfProduction / 100;
        return percentSalary;
    }
    public int mixedSalary() {
        int mixedSalary;
        mixedSalary = hourSalary() + percentSalary();
        return mixedSalary;
    }
}
