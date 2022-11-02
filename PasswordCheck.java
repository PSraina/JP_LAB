import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String str) {
        super(str);
    }
}

public class PasswordCheck {

    static boolean validatePassword(String password) {

        int length;
        length = password.length();

        int num_count = 0;
        int specialChar_count = 0;

        char CharArray[] = password.toCharArray();

        for (int i = 0; i < length; i++) {
            char c = CharArray[i];

            if (c >= '0' || c <= '9') {
                num_count++;
            }

            if ((c >= 32 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
                specialChar_count++;
            }
        }

        if (length < 8 || num_count == 0 || specialChar_count == 0) {
            return false;
        }

        return true;
    }

    public static void main ( String [] args)  throws InvalidPasswordException {
        String loginId, password;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter LoginID: ");
        loginId = sc.next();

        System.out.println("Enter Password: ");
        password = sc.next();

        if (validatePassword(password)) {
            System.out.println("Logged In Successfully!");
        }
        else {
            throw new InvalidPasswordException("Please enter valid password of length 8 containing one digit and one Special Symbol");
        }
    }
}
