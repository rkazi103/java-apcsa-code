package exercises.chapterseven;

import java.util.Scanner;

public class Exercise_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        System.out.print("Enter 10 values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        System.out.println("The smallest number is: " + findSmallest(values));

        input.close();
    }

    public static double findSmallest(double[] array) {
        double smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
