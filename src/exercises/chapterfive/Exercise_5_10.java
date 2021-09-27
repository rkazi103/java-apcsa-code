package exercises.chapterfive;

public class Exercise_5_10 {
    public static void main(String[] args) {
        int numberCount = 0;

        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                numberCount++;
                // Breaks new line if more than 10 numbers are on one line
                if (numberCount % 10 == 0)
                    System.out.println();
            }
        }
    }
}
