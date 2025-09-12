package Questions;

import java.util.Scanner;

public class P_factorialMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nos = in.nextInt();

        factorial(nos);
    }
    static void factorial(int n){
        if(n <= 0){
            System.out.println("invalid");

            } else  {
            int factor = 1;
            for (int i = 1; i <= n; i++) {

                factor = factor*i;
            }
            System.out.println(factor);
        }

    }
}
