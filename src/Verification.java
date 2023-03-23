import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Verification {
    private String login;
    private String password;
    private String confirmPassword;

    public Verification(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
    public boolean checkLogin() throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может быть больше 20 символов");
        }
        if (!login.matches("^[a-zA-Z0-9_]*$")) {
            System.out.println("Логин содержит некорректные символы");
            return false;
        }
        return true;
    }
    public boolean checkPassword() throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль не может быть больше 20 символов");
        }
        if (!password.matches("^[a-zA-Z0-9_]*$")) {
            System.out.println("Пароль содержит некорректные символы");
            return false;
        }
        return true;
    }
    public void checkConfirmPassword() throws WrongPasswordException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
    public boolean checkParameters() {
        try {
            if (!this.checkLogin() || !this.checkPassword()) {
                return false;
            }
                this.checkConfirmPassword();
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
