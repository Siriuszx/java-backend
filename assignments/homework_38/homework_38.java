package homework_38;

public class homework_38 {
    public static void main(String[] args) {
        UsersRepository usersRepository  = new UsersRepository();
        UsersService usersService = new UsersService(usersRepository);

        ProductsRepository productsRepository = new ProductsRepository();
        ProductsService productsService = new ProductsService(productsRepository);

        Menu menu = new Menu(usersService, productsService);

        menu.run();
    }
}
