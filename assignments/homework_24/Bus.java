package homework_24;

public class Bus extends Vehicle{
    private final int capacity;
    private int passengerCount;
    private int mileage;
    public Bus(String modelName, int yearOfManufacture, int capacity, int mileage) {
        super(modelName, yearOfManufacture);
        this.capacity = capacity;
        this.mileage = mileage;
    }

    public void takePassenger() {
        if(passengerCount < capacity) {
            passengerCount++;
            System.out.println("*+1 passenger*");
        } else {
            System.out.println("*the buss if full*");
        }
    }

    public void dropOffPassenger() {
        if(passengerCount > 0) {
            passengerCount--;
            System.out.println("*-1 passenger*");
        } else {
            System.out.println("*the are no passengers in the bus*");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMileage() {
        return mileage;
    }
}
