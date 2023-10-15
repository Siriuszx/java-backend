package homework_24;

public class Vehicle {
    private String modelName;
    int yearOfManufacture;
    public Vehicle(String modelName, int yearOfManufacture) {
        this.modelName = modelName;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void start() {
        System.out.println("*starting the vehicle*");
    }

    public void stop() {
        System.out.println("*stopping the vehicle*");
    }

    public String toString() {
        return modelName + " year of manufacture " + yearOfManufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
}
