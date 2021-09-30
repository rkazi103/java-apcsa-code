package exercises.chapterfive;

import java.util.Scanner;

public class Exercise_05_17_Teacher_Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines for a pyramid: ");
        int numberOfLines = input.nextInt();

        for (int i = 1; i <= numberOfLines; i++) {
            // Prints out the number of spaces needed
            for (int k = 1; k <= (numberOfLines - i); k++)
                System.out.print("    ");

            // Prints out the left side
            for (int k = i; k >= 1; k--)
                System.out.printf("%4d", k);

            // Prints out the right side
            for (int k = 2; k <= i; k++)
                System.out.printf("%4d", k);

            System.out.println();
        }

        input.close();
    }
}
