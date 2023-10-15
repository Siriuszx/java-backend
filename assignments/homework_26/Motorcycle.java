package homework_26;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, int mileage, int yearOfManufacture) {
        super(model, mileage, yearOfManufacture);
    }

    @Override
    public void startEngine() {
        System.out.println("*starts motorcycle engine*");
    }
}
