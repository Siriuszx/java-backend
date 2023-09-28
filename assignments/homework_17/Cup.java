package homework_17;

public class Cup {
    private final int maxCapacityML;
    private int currentLiquidAmountML;
    private String liquidType;

    public Cup(int maxCapacityML, String liquidType, int currentLiquidAmountML) {
        this.maxCapacityML = maxCapacityML;
        this.liquidType = liquidType;
        this.currentLiquidAmountML = currentLiquidAmountML;
    }

    public void lookAtTheCup() {
        System.out.printf("Max Capacity: %d\nThere is %s in this cup\nIt has %dML of liquid inside\n",
                maxCapacityML,
                liquidType,
                currentLiquidAmountML
        );
    }

    public void refill(int amountML) {
        if (currentLiquidAmountML + amountML <= maxCapacityML && amountML > 0) {
            currentLiquidAmountML += amountML;
            System.out.printf("*Refilling this cup of %s*", liquidType);
        } else {
            System.err.println("Error: invalid value.");
        }
    }

    public void drink(int amountML) {
        if (amountML <= currentLiquidAmountML && amountML > 0){
            currentLiquidAmountML -= amountML;
            System.out.printf("*Feels good to drink %s*\n", liquidType);
        }
        else {
            System.err.println("Error: invalid value.");
        }
    }

    public void stir() {
        System.out.printf("*Stirring a cup of %s*\n", liquidType);
    }

    public void changeLiquidType(String liquid) {
        if (currentLiquidAmountML == 0) {
            liquidType = liquid;
            System.out.printf("I am gonna be using this cup for %s now!\n", liquid);
        }
        else {
            System.err.println("Error: cup is not empty.");
        }
    }
}
