package part1.task39;

class Garage<T extends Vehicle> {
    private T vehicle;

    public void park(T vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleName() {
        return vehicle.getName();
    }
}