package Questions;

import java.util.Scanner;

public class P_factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        factorial(a);
    }
    public static void factorial(int num){
        if (num < 0) {
            System.out.println("Invalid");
            return;
        }
        int fact = 1;

        for (int i = 1; i <= num ; i++) {
                fact = fact * i;

        }
        System.out.println(fact);
    }
}
