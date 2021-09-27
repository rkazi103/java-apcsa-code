package exercises.chapterthree;

import java.util.Scanner;

public class Exercise_3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissors (0), rock (1), paper (2): ");
        int userNumber = input.nextInt();
        int computerNumber = (int) (Math.random() * 3);

        if (userNumber > 3) {
            System.out.println("You put something too high!");
            System.exit(1);
        }

        if (userNumber == 0) {
            if (computerNumber == 0)
                System.out.println("The computer is scissors. You are scissors as well. It is a draw.");
            else if (computerNumber == 1)
                System.out.println("The computer is rock. You are scissors. The computer wins.");
            else if (computerNumber == 2)
                System.out.println("The computer is paper. You are scissors. You win.");
        } else if (userNumber == 1) {
            if (computerNumber == 0)
                System.out.println("The computer is scissors. You are rock. You win.");
            else if (computerNumber == 1)
                System.out.println("The computer is rock. You are also rock. It is a draw.");
            else if (computerNumber == 2)
                System.out.println("The computer is paper. You are rock. The computer wins.");
        } else {
            if (computerNumber == 0)
                System.out.println("The computer is scissors. You are paper. The computer wins.");
            else if (computerNumber == 1)
                System.out.println("The computer is rock. You are paper. You win.");
            else if (computerNumber == 2)
                System.out.println("The computer is paper. You are also paper. It is a draw.");
        }

        input.close();
    }
}
