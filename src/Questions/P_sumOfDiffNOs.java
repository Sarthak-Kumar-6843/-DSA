package Questions;

import java.util.Scanner;

public class P_sumOfDiffNOs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        while (n != 0){

            if(n > 0){
                if (n%2 == 0){
                    sum1 += n;
                }
                if (n%2 != 0) {
                    sum2 += n;
                }
            }
            if( n < 0){
                sum3 += n;
            }
            n = in.nextInt();
        }
        System.out.println("Sum of positive even integers : " + sum1);
        System.out.println("Sum of positive odd integers : " + sum2);
        System.out.println("Sum of negative integers : " + sum3);
    }
}
