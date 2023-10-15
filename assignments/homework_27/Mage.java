package homework_27;

public class Mage extends GameCharacter {
    private String alias;
    private String className = "Mage";
    private String weaponType = "Book";

    public Mage(String alias) {
        this.alias = alias;
    }

    @Override
    public void attack() {
        System.out.printf("'%s' attacks using %s\n", alias, weaponType);
    }

    public void printInfo() {
        System.out.printf("Name: %s\nClass: %s\nWeapon: %s\n", alias, className, weaponType);
    }
}
