package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal > 15) {
            System.out.println("The value that was put in was invalid");
            System.exit(1);
        }

        if (decimal <= 9)
            System.out.printf("The hex value is %d", decimal);
        else {
            switch (decimal) {
                case 10:
                    System.out.println("The hex value is A");
                    break;
                case 11:
                    System.out.println("The hex value is B");
                    break;
                case 12:
                    System.out.println("The hex value is C");
                    break;
                case 13:
                    System.out.println("The hex value is D");
                    break;
                case 14:
                    System.out.println("The hex value is E");
                    break;
                case 15:
                    System.out.println("The hex value is F");
                    break;
            }
        }

        input.close();
    }
}