package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        System.out.print("Enter another string: ");
        String s2 = input.nextLine();

        if (s1.contains(s2))
            System.out.printf("The string \"%s\" is a substring of \"%s\"", s2, s1);
        else
            System.out.printf("The string \"%s\" is not a substring of \"%s\"", s2, s1);

        input.close();
    }
}
