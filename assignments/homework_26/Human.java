package homework_26;

public class Human {
    private String name;
    private int age;
    private int sprintSpeed;
    private int restTime;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.sprintSpeed = 10;
    }
    public Human(String name, int age, int sprintSpeed) {
        this.name = name;
        this.age = age;
        this.sprintSpeed = sprintSpeed;
    }

    public void run() {
        System.out.printf("Runs with the speed of %d km/h\n", sprintSpeed);
        getRest();
    }

    public void getRest() {
        System.out.printf("*rests for %d minutes*\n", restTime);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSprintSpeed() {
        return sprintSpeed;
    }

    public int getRestTime() {
        return restTime;
    }
}
