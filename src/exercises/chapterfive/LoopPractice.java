package exercises.chapterfive;

// import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int count = 0, sum = 0;

        // while (count <= 10) {
        // sum += count;
        // count++;
        // }

        // System.out.printf("The sum of the first %d numbers (0-9) is %d \n", (count -
        // 1), sum);

        System.out.print("   ");
        for (int i = 1; i < 10; i++)
            System.out.print("   " + i);
        System.out.println("\n ---------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
    }
}
