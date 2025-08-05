import java.util.Scanner;

public class MenuDriven {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n;

            do {
                System.out.println("Enter 1 to continue or 0 to exit:");
                n = in.nextInt();

                if (n == 1) {
                    System.out.println("Enter marks: ");
                    int marks = in.nextInt();

                    if (marks >= 90 && marks <= 100) {
                        System.out.println("Well done");
                    } else if (marks >= 70 && marks < 90) {
                        System.out.println("Good");
                    } else {
                        System.out.println("Try harder");
                    }
                } else if (n != 0) {
                    System.out.println("Please enter only 1 or 0");
                }

            } while (n != 0);

            System.out.println("Thank you!");
        }
    }



