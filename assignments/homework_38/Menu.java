package homework_38;

import java.util.Scanner;

public class Menu {

    private UsersService usersService;
    private ProductsService productsService;

    public Menu(UsersService usersService, ProductsService productsService) {
        this.usersService = usersService;
        this.productsService = productsService;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register a new user");
            System.out.println("2. Display all users");
            System.out.println("3. Create new product");
            System.out.println("4. Display all products");
            System.out.println("0. Exit");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0: {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
                break;

                case 1: {
                    System.out.println("Enter your first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter your last name: ");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.println("Choose a password: ");
                    String password = scanner.nextLine();

                    usersService.register(firstName, lastName, email, password);
                }
                break;

                case 2: {
                    User[] users = usersService.getAllUsers();

                    for (int i = 0; i < users.length; i++) {
                        System.out.println(users[i].getFirstName() + " " + users[i].getLastName());
                    }
                }
                break;

                case 3: {
                    System.out.println("Please enter Product Name: ");
                    String productName = scanner.nextLine();

                    System.out.println("Please enter Product Price: ");
                    long productPrice = Long.parseLong(scanner.nextLine());

                    System.out.println("Please enter Product Description: ");
                    String productDescription = scanner.nextLine();

                    productsService.addNewProduct(new Product(productName, productPrice, productDescription));
                }
                break;

                case 4: {
                    Product[] tempArr = productsService.getAllProducts();

                    for (int i = 0; i < tempArr.length; i++) {
                        System.out.printf("Product #%d\n", (i + 1));
                        System.out.printf("Product name: '%s'\nProduct price: %f EUR\nProduct description: '%s'\n\n",
                                tempArr[i].getTitle(),
                                tempArr[i].getPrice(),
                                tempArr[i].getDescription()
                        );
                    }
                }
                break;
            }

        }

    }
}
