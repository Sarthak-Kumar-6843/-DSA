package Questions;

import java.util.Scanner;

public class Ex_power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextInt();
        double n = in.nextInt();
        System.out.println(power(x,n));
    }
    public static double power(double x , double n){
        return  Math.pow(x,n);
    }
}
