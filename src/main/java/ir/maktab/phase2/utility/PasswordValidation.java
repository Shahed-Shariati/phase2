package ir.maktab.phase2.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static boolean isValidPassword(String passWord){
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);

        if(passWord == null)
            return false;

        Matcher matcher = pattern.matcher(passWord);

        return matcher.matches();

    }
}
