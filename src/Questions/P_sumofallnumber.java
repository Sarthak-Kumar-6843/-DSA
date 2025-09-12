package Questions;

import java.util.Scanner;

public class P_sumofallnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while (n != 0){

            sum = sum + n;
            n = in.nextInt();//to take input inside Loops.loops

        }

        System.out.println(sum);
    }
}
