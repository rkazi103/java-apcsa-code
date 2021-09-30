package apclassroom.unitfour;

public class Topic_04_04b {
    public static void main(String[] args) {
        // Nested Loop Example
        // Prints out: "*" "**" "***" "****"
        for (int outer = 1; outer < 5; outer++) {
            for (int inner = 1; inner <= outer; inner++)
                System.out.print("*");
            System.out.println();
        }
    }
}
