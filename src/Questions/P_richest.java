package Questions;

import java.util.Scanner;

public class P_richest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] wealth = new int[size];

        for (int i = 0; i < wealth.length; i++) {
            wealth[i] = in.nextInt();
        }
        int max = wealth[0];
        for (int i = 0; i < wealth.length; i++) {

            if (max < wealth[i]) {
                max = wealth[i];
            }
        }
        System.out.println("riches is : " + max);

    }
}
