package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexValue = input.nextLine();

        if (hexValue.length() != 1) {
            System.out.printf("%s is an invalid input \n", hexValue);
            System.exit(1);
        }

        int decimalValue = Integer.parseInt(hexValue, 16);
        String binaryValue = Integer.toBinaryString(decimalValue);
        System.out.printf("The binary value is %s \n", binaryValue);

        input.close();
    }
}
