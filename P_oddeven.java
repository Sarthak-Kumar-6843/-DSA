import java.util.Scanner;

public class P_oddeven {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
    }

