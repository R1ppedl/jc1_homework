package part1.task35;

public class Main {
    public static void main(String[] args) {
    FactoryWorker factoryWorker1 = new FactoryWorker(2,176, 10, 10000);
    System.out.println("Почасовая зарплата factoryWorker1: " + factoryWorker1.hourSalary());
    System.out.println("Процентная зарплата  factoryWorker1 : " + factoryWorker1.percentSalary());
    System.out.println("Смешанная зарплата factoryWorker1: " +factoryWorker1.mixedSalary());
    System.out.println();

    Carpenter carpenter1 = new Carpenter(1,17, 15, 15000, 4);
    System.out.println("Почасовая зарплата carpenter1: " + carpenter1.hourSalary());
    System.out.println("Процентная зарплата  carpenter1 : " + carpenter1.percentSalary());
    System.out.println("Смешанная зарплата carpenter1: " +carpenter1.mixedSalary());
    System.out.println();

    MajorCarpenter majorCarpenter = new MajorCarpenter(3,180, 25, 20000, 5,10);
    System.out.println("Почасовая зарплата majorCarpenter: " + majorCarpenter.hourSalary());
    System.out.println("Процентная зарплата  majorCarpenter : " + majorCarpenter.percentSalary());
    System.out.println("Смешанная зарплата majorCarpenter: " +majorCarpenter.mixedSalary());
    System.out.println();
    }
}
