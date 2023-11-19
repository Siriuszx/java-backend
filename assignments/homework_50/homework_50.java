package homework_50;

public class homework_50 {
    public static void main(String[] args) {
        String valid = "q2#Rtyui";
        String invalid = "12345678";

        try {
            System.out.println("My valid password is valid: " + PasswordValidator.validate(valid));
            PasswordValidator.validate(invalid);
        } catch (PasswordValidateException e) {
            System.err.println("Error: invalid password format\n\t" + e.getMessage());
        }

    }
}
