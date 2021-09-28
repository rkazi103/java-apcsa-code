package exercises.chapterfive;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * 
 * @see
 *      <p>
 *      Prompt: Write a program that displays all the numbers from 100-1,000,
 *      ten per line, that are divisible by 5 and 6. Numbers are separated by
 *      exactly one space.
 *      </p>
 */
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
