package exercises.chapterfive;

public class Exercise_5_19 {
    public static void main(String[] args) {
        int numberOfLines = 8;

        for (int i = 0; i < numberOfLines; i++) {
            // prints out the number of spaces
            for (int j = numberOfLines - i - 1; j > 0; j--)
                System.out.print("     ");

            // prints out left side of numbers
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    System.out.printf("%-1.0f", Math.pow(2, j));
                else
                    System.out.printf("%5.0f", Math.pow(2, j));
            }

            // prints out right side of numbers
            for (int j = i - 1; j >= 0; j--)
                System.out.printf("%5.0f", Math.pow(2, j));

            System.out.println();
        }
    }
}
