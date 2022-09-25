package pl.sda;

import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isCorrectEmailFormat(String mail) {
        return Pattern.compile("[A-Za-z0-9._]+@[a-z]+(.[a-z]+)*").matcher(mail).matches();
    }
}
