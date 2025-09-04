package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class P_searchforX {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];
        int x = in.nextInt();

        for (int i = 0; i < size; i++) {
            num[i] = in.nextInt();
        }


        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println("x is at index : " + i);
            }
        }


    }
}
