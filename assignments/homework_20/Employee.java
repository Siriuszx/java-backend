package homework_20;

public class Employee {
    private int age = 0;
    private String name = "default";
    private float salary = 0;
    private final String UID;

    Employee(int age, String name, float salary, String UID) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.UID = UID;
    }

    public String getInfo() {
        return String.format("Name: %s\nAge: %d\nSalary: %f EUR\n", getName(), getAge(), getSalary());
    }

    public String getUID() {
        return UID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
