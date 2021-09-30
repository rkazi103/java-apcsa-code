package exercises.chapterfive;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * @see General Note I: Add smaller floating point numbers to bigger floating
 *      point numbers first to avoid rounding errors.
 * @see General Note II: If there is a semicolon after a for-loop header, there
 *      is no loop body but the loop variable (if it isn't local) is still
 *      changed
 * 
 */
public class ChapterFivePracticeQuizNotes {
    /**
     * <p>
     * Prints out "Welcome to Java <strong>10 times</strong>".
     * </p>
     * <p>
     * If there is an increment operator in loop continuation condition, then
     * completely ignore it
     * </p>
     */
    public static void number3() {
        int count = 3;
        while (count++ < 10)
            System.out.println("Welcome to Java");
    }

    /**
     * <p>
     * The value of variable x is 4.
     * </p>
     * 
     * <p>
     * The loop ran 4 times, so it ran <code>x++</code> 4 times
     * </p>
     */
    public static void number4() {
        int x = 0;
        while (x < 4)
            x++;
    }

    /**
     * <p>
     * Prints out "Welcome to Java" 10 times.
     * </p>
     * <p>
     * <code>do-while</code> run the loop body, then check loop continuation
     * condition. Therefore, the loop <strong>MUST ALWAYS RUN ONCE<strong>
     * </p>
     */
    public static void number6() {
        int count = 0;
        do {
            System.out.println("Welcome to Java");
            count++;
        } while (count < 10);
    }

    /**
     * <p>
     * Prints out "Welcome to Java" 11 times.
     * </p>
     * <p>
     * The loop runs once when <code>count</code> is 0. Then
     * <code>(count++ > 10)</code> increments <code>count</code> by 1 and
     * <strong>uses the old value of <code>count</code></strong> to check the loop
     * continuation condition.
     * </p>
     * <p>
     * Think of it as counting 0-10 with both sides inclusive
     * </p>
     */
    public static void number7() {
        int count = 0;
        do {
            System.out.println("Welcome to Java");
        } while (count++ < 10);
    }

    /**
     * <p>
     * Prints out "Welcome to Java" 10 times
     * </p>
     * <p>
     * You can ignore the pre-increment condition here.
     * </p>
     */
    public static void number8() {
        int count = 0;
        do {
            System.out.println("Welcome to Java");
        } while (++count < 10);
    }

    /**
     * <p>
     * The value of <code>y</code> is 45
     * </p>
     * <p>
     * Sums up all the values from 0-9: 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
     * </p>
     */
    public static void number15() {
        int y = 0;
        for (int i = 0; i < 10; ++i) {
            y += i;
        }
        System.out.println(y);
    }
}
