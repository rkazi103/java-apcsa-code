package exercises.chapterfive;

public class Exercise_05_05_Teacher_Solution {
    public static void main(String[] args) {
        int poundsRightSide = 20;
        double poundsLeftSide = 0, kilogramsRightSide = 0, kilogramsLeftSide = 0;
        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

        for (int i = 1; i <= 199; i += 2) {
            kilogramsLeftSide = (double) i;
            poundsLeftSide = kilogramsLeftSide * 2.2;
            kilogramsRightSide = poundsRightSide * .454;
            System.out.printf("%d\t\t%5.1f\t|\t%d\t%9.2f\n", (int) kilogramsLeftSide, poundsLeftSide, poundsRightSide,
                    kilogramsRightSide);
            poundsRightSide += 5;
        }
    }
}
