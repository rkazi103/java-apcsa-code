package exercises.chaptersix;

import java.util.Scanner;

public class Exercise_06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a good password: ");
        String password = input.nextLine();
        isValidPassword(password);
        input.close();
    }

    public static boolean isValidPassword(String password) {
        int numberOfLetters = 0;
        int numberOfDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            if (isLetterOrDigit(password.charAt(i)) == 0) {
                numberOfLetters++;
            }
            if (isLetterOrDigit(password.charAt(i)) == 1) {
                numberOfDigits++;
            }
            if (isLetterOrDigit(password.charAt(i)) == -1) {
                System.out.println("A password must only contain letters and digits");
                return false;
            }
        }

        if (numberOfLetters < 8) {
            System.out.println("A password must contain at least 8 characters");
            return false;
        }
        if (numberOfDigits < 2) {
            System.out.println("A password must contain at least 2 digits");
            return false;
        }

        System.out.println("Good Password! ");
        return true;
    }

    public static int isLetterOrDigit(char ch) {
        // Is it a letter?
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            return 0;

        // Is it a number?
        if (ch >= '0' && ch <= '9')
            return 1;

        // Contains special characters
        return -1;
    }
}
