package exercises.chaptersix;

public class Exercise_06_08 {
    public static void main(String[] args) {
        printTable();
    }

    public static void printTable() {
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\nCelsius");

        int fahrenheitRightSide = 120;
        double fahrenheitLeftSide = 0, celsiusRightSide = 0, celsiusLeftSide = 0;

        for (int i = 40; i > 30; i--) {
            celsiusLeftSide = (double) i;
            fahrenheitLeftSide = celsiusToFahrenheit(celsiusLeftSide);
            celsiusRightSide = fahrenheitToCelsius(fahrenheitRightSide);
            System.out.printf("%d\t\t%5.1f\t|\t%d\t%9.2f\n", (int) celsiusLeftSide, fahrenheitLeftSide,
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
