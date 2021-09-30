package exercises.chapterfive;

/**
 * @author <a href="https://github.com/rkazi103">@rkazi103</a>
 * 
 * @see
 *      <p>
 *      Prompt: Write a program that displays the following two tables side by
 *      side.
 *      </p>
 */
public class Exercise_05_05 {
    public static void main(String[] args) {
        double kilogramsLeftside, kilogramsRightside, poundsLeftside, poundsRightSide;

        System.out.println("Kilograms\tPounds | Pounds\tKilograms");

        for (int i = 1; i <= 200; i += 2) {
            kilogramsLeftside = i;
            poundsRightSide = 20 + i / 2 * 5;
            poundsLeftside = kilogramsLeftside * 2.2;
            kilogramsRightside = poundsRightSide / 2.2;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", kilogramsLeftside, poundsLeftside, poundsRightSide,
                    kilogramsRightside);
        }
    }
}
