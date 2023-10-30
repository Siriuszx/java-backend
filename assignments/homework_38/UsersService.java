package homework_38;

public class UsersService {

    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void register(String firstName, String lastName, String email, String password) {

        if (usersRepository.isExistsByEmail(email)) {
            System.err.println("Error: user with this email already exists.");
            return;
        }

        User user = new User(firstName, lastName, email, password);

        usersRepository.save(user);
    }

    public User[] getAllUsers() {
        return usersRepository.findAll();
    }
}