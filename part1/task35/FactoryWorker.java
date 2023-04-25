package part1.task35;

public  class FactoryWorker implements FactorySalary {
    public int cex;
    protected int hours;

    protected int rateSalary;

    protected int valueOfProduction;

    public FactoryWorker(int cex, int hours, int rateSalary, int valueOfProduction) {
        this.cex = cex;
        this.hours = hours;
        this.rateSalary = rateSalary;
        this.valueOfProduction = valueOfProduction;
    }
    public int hourSalary(){
        int hourSalary;
        hourSalary = rateSalary * hours;
        return hourSalary;
    }
    public int percentSalary() {
        int percentSalary;
        percentSalary = 5 * valueOfProduction / 100;
        return percentSalary;
    }
    public int mixedSalary() {
        int mixedSalary;
        mixedSalary = hourSalary() + percentSalary();
        return mixedSalary;
    }
}
