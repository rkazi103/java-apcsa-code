package exercises.chaptersix;

public class Exercise_06_08 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.printf("%-15s%-15s%-5s%-15s%-15s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");

        int fahrenheitRightSide = 120;
        double fahrenheitLeftSide = 0, celsiusRightSide = 0, celsiusLeftSide = 0;

        for (int i = 40; i > 30; i--) {
            celsiusLeftSide = (double) i;
            fahrenheitLeftSide = celsiusToFahrenheit(celsiusLeftSide);
            celsiusRightSide = fahrenheitToCelsius(fahrenheitRightSide);
            System.out.printf("%-15d%-15.3f%-5s%-15d%-15.3f\n", (int) celsiusLeftSide, fahrenheitLeftSide, "|",
                    fahrenheitRightSide, celsiusRightSide);
            fahrenheitRightSide -= 10;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return ((9.0 / 5) * celsius + 32);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((5.0 / 9) * (fahrenheit - 32));
    }
}
