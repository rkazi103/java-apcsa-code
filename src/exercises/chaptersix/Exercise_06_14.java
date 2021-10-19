package exercises.chaptersix;

public class Exercise_06_14 {
    public static void main(String[] args) {
        System.out.println("i       m(i)");
        System.out.println("--------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-8d%.4f\n", i, estimatePi(i));
        }
    }

    public static double estimatePi(int value) {
        double decimalPartOfPi = 1;
        for (int i = 2; i <= value; i++)
            decimalPartOfPi += Math.pow(-1, i + 1) / (2 * i - 1.0);

        return 4.0 * decimalPartOfPi;
    }

}
