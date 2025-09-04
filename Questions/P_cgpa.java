package Questions;

import java.util.Scanner;

public class P_cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int totalMarks = 0;
        int subjects = 0;

        System.out.print("Enter total number of subjects: ");
        subjects = in.nextInt();

        // Input validation
        if (subjects <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        // Loop to input marks for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = in.nextInt();
            totalMarks += marks;
        }

        double cgpa = totalMarks / (double) subjects / 9.5;  // assuming 9.5 conversion factor
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("CGPA is: %.2f\n", cgpa);
    }
}

