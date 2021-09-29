package exercises.chapterfive;

import java.util.Scanner;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * 
 * @see
 *      <p>
 *      Prompt: Write a program that reads an unspecified number of integers,
 *      determines how many positive and negative values have been read, and
 *      computes the sum and average of the values read (not including 0). The
 *      program ends with input 0.
 *      </p>
 */
public class Exercise_05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberOfValuesRead = 0; // will be used to calculate avg later on
        double sumOfValuesRead = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int valueRead = input.nextInt();

        while (valueRead != 0) {
            // Number read is positive or negative
            if (valueRead > 0)
                numberOfPositives++;
            else
                numberOfNegatives++;

            numberOfValuesRead++;
            sumOfValuesRead += valueRead;

            // makes it so that user can enter in an unspecified amount of numbers
            valueRead = input.nextInt();
        }

        if (numberOfValuesRead == 0) {
            System.out.println("No numbers are entered besides 0");
            System.exit(0);
        } else {
            double average = sumOfValuesRead / (numberOfValuesRead * 1.0);

            System.out.printf("The number of positives is %d \n", numberOfPositives);
            System.out.printf("The number of negatives is %d \n", numberOfNegatives);
            System.out.printf("The sum of the values read is %.1f \n", sumOfValuesRead);
            System.out.printf("The total is %.2f \n", average);
        }

        input.close();
    }
}
