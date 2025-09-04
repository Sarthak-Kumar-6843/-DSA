package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class P_howmanyNumareSmallerThantheCurrent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] num = new int[size];
        int[] result = new int[size];


        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int min = num[0];
        for (int i = 0; i < num.length; i++) {//for changing the number
            int count = 0;
            for (int j = 0; j < num.length; j++) {//to check every number


                if (num[j] < num[i]) {
                    count++;
                }

            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
    }

}
