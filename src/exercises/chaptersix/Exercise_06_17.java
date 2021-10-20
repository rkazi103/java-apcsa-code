package exercises.chaptersix;

import java.util.Scanner;

public class Exercise_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of lines for n by n matrix: ");
        int numberOfLines = input.nextInt();
        printMatrix(numberOfLines);
        input.close();
    }

    public static void printMatrix(int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfLines; j++)
                System.out.print(Math.random() < 0.5 ? "0 " : "1 ");
            System.out.println();
        }
    }
}
