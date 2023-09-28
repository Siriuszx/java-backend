package homework_17;

import java.lang.reflect.Array;

public class CoffeeMachine {
    private String[] modes = new String[]{"Latte", "Americano", "Latte Macchiato", "Espresso", "Cappuccino"};

    private int currentWaterML = 0;
    private final int maxWaterML;

    private int currentCoffeeG = 0;
    private final int maxCoffeeG;

    private final String brand;

    public CoffeeMachine(int maxWaterML, int maxCoffeeG, String brand) {
        this.maxWaterML = maxWaterML;
        this.maxCoffeeG = maxCoffeeG;
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s\nMax Water Capacity: %d\nMax Coffee Capacity: %d\n\nCurrent Water Amount: %d\nCurrent Coffee Amount: %d\n",
                brand,
                maxWaterML,
                maxCoffeeG,
                currentWaterML,
                currentCoffeeG
        );

        System.out.println("Available modes:");

        for (String mode : modes) {
            System.out.println(mode);
        }
    }

    public Cup makeCoffee(String brewType) {
        for (int i = 0; i < modes.length; i++) {
            if (modes[i].equals(brewType)) break;
            if (i == modes.length - 1) return null;
        }

        if(currentWaterML - 330 >= 0 && currentCoffeeG - 10 >= 0) {
            currentCoffeeG -= 10;
            currentWaterML -= 330;
        }

        return new Cup(330, brewType, 330);
    }

    public void refill(int waterML, int coffeeG) {
        if ((currentWaterML + coffeeG) <= maxWaterML && (currentCoffeeG + coffeeG) <= maxCoffeeG && waterML > 0 && coffeeG > 0) {
            currentWaterML += waterML;
            currentCoffeeG += coffeeG;
        } else {
            System.err.println("Error: ingredients overflow");
        }
    }
}
