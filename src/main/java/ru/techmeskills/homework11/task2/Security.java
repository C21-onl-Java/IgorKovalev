package ru.techmeskills.homework11.task2;

public class Security {
    //private String login, password, confirmPassword;
    public static boolean ifContainsDigit(String password) {
        for (char c : password.toCharArray()
        ) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkPassword(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {

        if (login.length() < 20 && !login.contains(" ")) {
            if (ifContainsDigit(password) && password.length() < 20 &&
                    !password.contains(" ") && password.equals(confirmPassword)) {
                return true;
            } else {
                throw new WrongPasswordException("Пароль не соответствует условию");
            }

        }
        else {
            throw new WrongLoginException("Логин не соответствует условию.");
        }

    }
}
