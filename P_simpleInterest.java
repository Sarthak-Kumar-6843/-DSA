import java.util.Scanner;

public class P_simpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P = ");
        double P = in.nextDouble();;
        System.out.print("Enter R = ");
        double R = in.nextDouble();
        System.out.print("Enter T = ");
        double T = in.nextDouble();

        double SimpleInterest;
        SimpleInterest = (P*R*T)/100 ;

        System.out.println("SimpleInterest is : " + SimpleInterest);
    }
}
