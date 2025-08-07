import java.util.Scanner;

public class Ex_user {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int a;
        while (true) {
            System.out.print("Enter 1 or 0: ");
            a = in.nextInt();

            if (a == 1) {
                System.out.print("Enter marks: ");
                int marks = in.nextInt();
                check(a, marks);
            } else if (a == 0) {
                System.out.println("ty");
                break; // Exit the loop
            } else {
                System.out.println("Invalid input. Please enter 1 or 0.");
            }
        }
    }
    public static void check(int n,int marks){
        Scanner in = new Scanner(System.in);

        if (n == 1){

            if (marks > 90){
                System.out.println("gud");
            }else {
                System.out.println("normal");
            }
        } else if (n == 0) {
            System.out.println("ty");
        }else {
            System.out.println("Enter 1 or 0");
        }

    }
}
