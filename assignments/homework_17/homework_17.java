package homework_17;

public class homework_17 {
    public static void main(String[] args) {
        Phone myPhone = new Phone(4, 256,"iPhone 11 Pro Max", 1242, 2688, 6.5f, "17.0.1");

        myPhone.displayInfo();
        myPhone.updateOSVersion("17.0.2");

        System.out.println();

        myPhone.sendMsg("Hey bro, how are you?","Oleg");

        System.out.println();

        System.out.println("*Using calculator*");
        System.out.println(myPhone.multiply(2,2));

        System.out.println("---------------------------------------------");

        CoffeeMachine myCoffeeMachine = new CoffeeMachine(2000, 400, "WMF");
        myCoffeeMachine.refill(2000, 100);
        myCoffeeMachine.displayInfo();

        System.out.println();

        Cup myCupOfSomething = myCoffeeMachine.makeCoffee("Latte");
        myCupOfSomething.lookAtTheCup();

        System.out.println();

        myCupOfSomething.drink(330);
        myCupOfSomething.lookAtTheCup();

        System.out.println();

        myCupOfSomething.changeLiquidType("Americano");
//        myCupOfSomething.refill(340);
        myCupOfSomething.refill(330);

        System.out.println();

        myCupOfSomething.lookAtTheCup();

        System.out.println();

        myCupOfSomething.stir();
        myCupOfSomething.drink(100);

        System.out.println();

//        Cup newBrew = myCoffeeMachine.makeCoffee("Water");
//        newBrew.lookAtTheCup();
    }
}

