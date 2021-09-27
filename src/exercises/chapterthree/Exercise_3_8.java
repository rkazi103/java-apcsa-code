package exercises.chapterthree;

import java.util.Scanner;

public class Exercise_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in three integers: ");

        int greatest;
        int middle;
        int least;

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                greatest = a;

                if (b > c) {
                    middle = b;
                    least = c;

                    System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
                } else {
                    middle = c;
                    least = b;

                    System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
                }
            } else {
                least = b;
                middle = a;
                greatest = c;

                System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
            }
        } else {
            if (b > c) {
                greatest = b;

                if (a > c) {
                    middle = a;
                    least = c;

                    System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
                } else {
                    middle = c;
                    least = a;

                    System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
                }
            } else {
                least = a;
                middle = b;
                greatest = c;

                System.out.println("The sorted numbers are " + least + " " + middle + " " + greatest);
            }
        }

        input.close();
    }
}
