package Questions;

import java.util.Scanner;

public class P_add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(add(a,b));
    }
    public static int add(int num1 , int num2 ){

        return num1 + num2;
    }
}
