package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine().toLowerCase();
        char character = letter.charAt(0);

        if (character == 'a' || character == 'b' || character == 'c')
            System.out.println("The corresponding number is 2");
        else if (character == 'd' || character == 'e' || character == 'f')
            System.out.println("The corresponding number is 3");
        else if (character == 'g' || character == 'h' || character == 'i')
            System.out.println("The corresponding number is 4");
        else if (character == 'j' || character == 'k' || character == 'l')
            System.out.println("The corresponding number is 5");
        else if (character == 'm' || character == 'n' || character == 'o')
            System.out.println("The corresponding number is 6");
        else if (character == 'p' || character == 'q' || character == 'r' || character == 's')
            System.out.println("The corresponding number is 7");
        else if (character == 't' || character == 'u' || character == 'v')
            System.out.println("The corresponding number is 8");
        else if (character == 'w' || character == 'x' || character == 'y' || character == 'z')
            System.out.println("The corresponding number is 9");
        else
            System.out.printf("%s is an invalid input \n", letter);

        input.close();
    }
}
