package Questions;

import java.util.Scanner;

public class P_subtractSumandProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int product = 1;
        int sum = 0;
        int n = in.nextInt();

        while(n>0){
          int  rem = n%10;
          n = n/10;
          sum = sum + rem;
          product = product*rem;
        }

        int subtract = product - sum;
        System.out.println(subtract);
    }
}
