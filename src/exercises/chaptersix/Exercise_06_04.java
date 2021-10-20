package exercises.chaptersix;

import java.util.Scanner;

public class Exercise_06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in an integer: ");
        int number = input.nextInt();
        reverse(number);
        input.close();
    }

    public static void reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber *= 10; // Add zero to the reversed number number
            reversedNumber += number % 10; // Remove zero and add actual digit to reversed number
            number /= 10; // Remove digit from original number
        }

        System.out.println("The reversed number is: " + reversedNumber);
    }
}
