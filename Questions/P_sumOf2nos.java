package Questions;

import java.util.Scanner;

public class P_sumOf2nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        sum(num1,num2);

    }
    static void sum(int a, int b){
        int sum = 0;
        sum = a+b;
        System.out.println(sum);
    }
}
