package Questions;

import java.util.Scanner;

public class Ex_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] num = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println(min);
    }
}
