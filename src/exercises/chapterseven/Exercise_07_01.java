package exercises.chapterseven;

import java.util.Scanner;

public class Exercise_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        System.out.printf("Enter %d scores: ", numberOfStudents);

        int[] grades = new int[numberOfStudents];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();
        }
        grades = sortArray(grades);

        printGrades(grades);

        input.close();
    }

    public static void printGrades(int[] grades) {
        int bestGrade = getBestGrade(grades);
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s \n", i, grades[i],
                    getGradeLetter(grades[i], bestGrade));
        }
    }

    public static int getBestGrade(int[] grades) {
        int max = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (max < grades[i])
                max = grades[i];
        }

        return max;
    }

    // Selection sort on array
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }

        return array;
    }

    // Calculuate grade letter
    public static String getGradeLetter(int grade, int bestGrade) {
        if (grade >= bestGrade - 10)
            return "A";
        else if (grade >= bestGrade - 20)
            return "B";
        else if (grade >= bestGrade - 30)
            return "C";
        else if (grade >= bestGrade - 40)
            return "D";
        else
            return "F";
    }
}
