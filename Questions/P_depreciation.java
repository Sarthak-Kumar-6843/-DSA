package Questions;

import java.util.Scanner;

public class P_depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose Straight or Reducing balance");
        String choose = in.next();
        System.out.print("enter cost : ");
        double cost = in.nextDouble();
        System.out.print("enter salvage : ");
        double Salvage_value = in.nextDouble();
        System.out.print("enter life : ");
        double life = in.nextDouble();
        double depreciation_rate = 15;
        double depreciation_value ;

        if(choose.equalsIgnoreCase("Straight") ){//check if choose = straight and ignores uppercase and lowercase
            depreciation_value = (cost - Salvage_value)/life;
            System.out.println(depreciation_value);
        } else if (choose.equalsIgnoreCase("Reducing")) {

            double value_inthatYear = cost*Math.pow(1 - (depreciation_rate / 100), life);
            System.out.println(value_inthatYear);

        }else {
            System.out.println("wrong input");
        }

    }
}
