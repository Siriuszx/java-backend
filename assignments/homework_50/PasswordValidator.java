package homework_50;

public class PasswordValidator {
    public static boolean validate(String password) throws PasswordValidateException {
        boolean lengthFlag = false;
        boolean lowerCaseFlag = false;
        boolean upperCaseFlag = false;
        boolean digitFlag = false;
        boolean specialSymbolFlag = false;

        if (password.length() >= 8) lengthFlag = true;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) lowerCaseFlag = true;
            if (Character.isUpperCase(ch)) upperCaseFlag = true;
            if (Character.isDigit(ch)) digitFlag = true;
            if ("!@#$%^&*".contains(String.valueOf(ch))) specialSymbolFlag = true;
        }

        if(!lengthFlag) throw new PasswordValidateException("password is too short");
        if(!lowerCaseFlag) throw new PasswordValidateException("password must contain at least one lowercase character");
        if(!upperCaseFlag) throw new PasswordValidateException("password must contain at least one uppercase character");
        if(!digitFlag) throw new PasswordValidateException("password must contain at least one digit");
        if(!specialSymbolFlag) throw new PasswordValidateException("password must contain at least one special symbol");

        return true;
    }
}
