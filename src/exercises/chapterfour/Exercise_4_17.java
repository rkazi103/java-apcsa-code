package exercises.chapterfour;

import java.util.Scanner;

public class Exercise_4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter in the name of a month: ");
        String month = input.nextLine().substring(0, 3);
        String monthCapitalized = month.substring(0, 1).toUpperCase() + month.substring(1);

        System.out.print("Enter in the year: ");
        int year = input.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // February exception
        if (month.toLowerCase().charAt(0) == 'f') {
            if (isLeapYear)
                System.out.printf("%s %d has 29 days", monthCapitalized, year);
            else
                System.out.printf("%s %d has 28 days", monthCapitalized, year);
            System.exit(0);
        }

        switch (month.toLowerCase()) {
            case "jan":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "mar":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "apr":
                System.out.printf("%s %d has 30 days", monthCapitalized, year);
                break;
            case "may":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "jun":
                System.out.printf("%s %d has 30 days", monthCapitalized, year);
                break;
            case "jul":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "aug":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "sep":
                System.out.printf("%s %d has 30 days", monthCapitalized, year);
                break;
            case "oct":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            case "nov":
                System.out.printf("%s %d has 30 days", monthCapitalized, year);
                break;
            case "dec":
                System.out.printf("%s %d has 31 days", monthCapitalized, year);
                break;
            default:
                System.out.println("You didn't enter in the month properly!");
                break;
        }

        input.close();
    }
}
