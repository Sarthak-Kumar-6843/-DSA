import java.util.Scanner;

public class P_electricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fixed_charge = 500;
        System.out.print("enter units : ");
        int units = in.nextInt();

        int rate_per_units = 100;

        int charge = units*rate_per_units + fixed_charge;

        System.out.println("the bill is of total : " + charge);
    }
}
