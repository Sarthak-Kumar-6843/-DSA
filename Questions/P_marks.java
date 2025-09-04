package Questions;

import java.util.Scanner;

public class P_marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();

        printGrade(marks);
    }

    static void printGrade(int n) {
        if (n > 100 || n < 0) {
            System.out.println("Invalid marks");
        } else if (n >= 91) {
            System.out.println("AA");
        } else if (n >= 81) {
            System.out.println("A");
        } else if (n >= 71) {
            System.out.println("BB");
        } else if (n >= 61) {
            System.out.println("B");
        } else if (n >= 51) {
            System.out.println("CC");
        } else if (n >= 41) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}

