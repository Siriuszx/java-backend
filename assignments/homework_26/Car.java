package homework_26;

public class Car extends Vehicle{
    public Car(String model, int mileage, int yearOfManufacture) {
        super(model, mileage, yearOfManufacture);
    }

    @Override
    public void startEngine() {
        System.out.println("*starting car engine*");
    }
}
