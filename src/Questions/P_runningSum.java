package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class P_runningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            result[i] = sum;

        }
        System.out.println("sum is : " + sum);
        System.out.println(Arrays.toString(result));

    }
}
