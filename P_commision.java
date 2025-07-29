import java.util.Scanner;

public class P_commision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int commision = 5;
        double sales = in.nextDouble();
        double commision_amount = (sales*commision)/100 ;
        System.out.println(commision_amount);
    }
}
