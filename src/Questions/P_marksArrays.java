package Questions;

import java.util.Scanner;

public class P_marksArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        //input
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }


        //output
        for (int i = 0; i < n; i++) {
            System.out.println(num[i]);
        }
    }
}
