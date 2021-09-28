package exercises.chapterfive;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * @see
 *      <p>
 *      Write a program the approximates pi at i=10000, 20000, and 100000 using
 *      the following summation formula.
 *      </p>
 */
public class Exercise_5_25 {
    public static void main(String[] args) {
        double PI = 1.0;
        for (int i = 2; i <= 100000; i++) {
            // formula from prompt that gets the decimals for PI
            PI += Math.pow(-1, i + 1) / (2 * i - 1.0);

            // prints out 4 * the decimal values of PI
            if (i % 10000 == 0)
                System.out.println("i = " + i + "\tPI = " + 4.0 * PI);
        }
    }
}
