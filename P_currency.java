import java.util.Scanner;

public class P_currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rupees : ");
        double rupees = in.nextDouble();

        double usd = rupees*(0.012);

        System.out.print("dollar : " + usd);

        }

    }

