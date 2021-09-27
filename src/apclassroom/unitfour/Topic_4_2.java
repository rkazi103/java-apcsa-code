package apclassroom.unitfour;

public class Topic_4_2 {
    public static void main(String[] args) {
        // For loop printing out numbers 1-5
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }
        System.out.println("Finished");

        // While loop printing out same numbers 1-5 as for loop above
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }
        System.out.println("Finished");

        // The above code shows you can convert between a while loop and a for loop

    }
}
