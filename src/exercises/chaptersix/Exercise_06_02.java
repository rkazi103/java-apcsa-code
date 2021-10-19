package exercises.chaptersix;

import java.util.Scanner;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * @version 1.0.0`
 */
public class Exercise_06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in an integer: ");
        long number = input.nextLong();
        System.out.println("The sum of the digits in the number is " + sumDigits(number));

        input.close();
    }

    /**
     * Sums up the digits in a number
     * 
     * @param n
     * @return sum of the digits of the number <code>n</code>
     */
    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10; // Extracts digit and adds them to sum
            n /= 10; // Remove the extracted digit
        }

        return sum;
    }
}
