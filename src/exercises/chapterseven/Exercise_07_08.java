package exercises.chapterseven;

import java.util.Scanner;

public class Exercise_07_08 {
    public static void main(String args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        System.out.print("Enter a value: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The average of the numbers is: " + average(values));

        input.close();
    }

    public static int average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static double average(double[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

}
