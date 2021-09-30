package apclassroom.unitfour;

public class Topic_04_04a {
    public static void main(String[] args) {
        // Nested Loops Example
        // Prints out "1 2" four times
        for (int outer = 1; outer < 5; outer++) {
            for (int inner = 1; inner < 3; inner++)
                System.out.print(inner + " ");
            System.out.println();
        }
    }
}
