package part1.task39;

public class Main {
    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        Car car = new Car("Toyota");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson");

        carGarage.park(car);
        motorcycleGarage.park(motorcycle);

        System.out.println(carGarage.getVehicleName());
        System.out.println(motorcycleGarage.getVehicleName());
    }
}