package homework_29;

public class Triathlete implements Swimmer, Runner {
    private int currentStamina;

    public Triathlete(int defaultStamina) {
        this.currentStamina = defaultStamina;
    }

    @Override
    public void run() {
        if(currentStamina >= 10) {
            currentStamina -= 10;
            System.out.println("I run.");
        } else {
            System.out.println("Not enough stamina.");
        }
    }

    @Override
    public void swim(){
        if(currentStamina >= 10) {
            currentStamina -= 10;
            System.out.println("I swim.");
        } else {
            System.out.println("Not enough stamina.");
        }
    }

    public int getCurrentStamina() {
        return currentStamina;
    }
}
