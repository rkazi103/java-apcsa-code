package exercises.chapterthree;

import java.util.Scanner;

public class Exercise_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.sqrt(Math.pow(b, 2.0) - (4.0 * a * c));

        if (discriminant > 0) {
            double root1 = ((-1 * b) + discriminant) / (2 * a);
            double root2 = ((-1 * b) - discriminant) / (2 * a);
            System.out.println("The equation has two roots " + (int) (root1 * 1000000) / 1000000.0 + " and "
                    + (int) (root2 * 1000000) / 1000000.0);
        } else if (discriminant == 0) {
            double root = ((-1 * b) + discriminant) / (2 * a);
            System.out.println("The equation has one root " + (int) root);
        } else {
            System.out.println("This equation has no real roots");
        }

        input.close();
    }
}