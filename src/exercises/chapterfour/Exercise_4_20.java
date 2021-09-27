package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a string: ");
        String value = input.nextLine();

        System.out.printf("The length of the string you entered in is: %d \n", value.length());
        System.out.println("The first character of the string you printed is: " + value.charAt(0));

        input.close();
    }
}
