package exercises.chapterfour;

import java.util.Scanner;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * 
 *         <p>
 *         Modified version that met teacher guidelines.
 *         </p>
 * 
 */
public class Exercise_4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexValue = input.nextLine();
        char hexCharacter = hexValue.charAt(0);

        if (hexValue.length() != 1 || !(hexCharacter >= 48 && hexCharacter <= 70)) {
            System.out.printf("%s is an invalid input \n", hexValue);
            System.exit(1);
        }

        int decimalValue = Integer.parseInt(hexValue, 16);
        // String binaryValue = Integer.toBinaryString(decimalValue);
        // System.out.printf("The binary value is %s \n", binaryValue);

        switch (decimalValue) {
            case 0:
                System.out.println("The binary value is 0000");
                break;
            case 1:
                System.out.println("The binary value is 0001");
                break;
            case 2:
                System.out.println("The binary value is 0010");
                break;
            case 3:
                System.out.println("The binary value is 0011");
                break;
            case 4:
                System.out.println("The binary value is 0100");
                break;
            case 5:
                System.out.println("The binary value is 0101");
                break;
            case 6:
                System.out.println("The binary value is 0110");
                break;
            case 7:
                System.out.println("The binary value is 0111");
                break;
            case 8:
                System.out.println("The binary value is 1000");
                break;
            case 9:
                System.out.println("The binary value is 1001");
                break;
            case 10:
                System.out.println("The binary value is 1010");
                break;
            case 11:
                System.out.println("The binary value is 1011");
                break;
            case 12:
                System.out.println("The binary value is 1100");
                break;
            case 13:
                System.out.println("The binary value is 1101");
                break;
            case 14:
                System.out.println("The binary value is 1110");
                break;
            case 15:
                System.out.println("The binary value is 1111");
                break;
        }

        input.close();
    }
}
