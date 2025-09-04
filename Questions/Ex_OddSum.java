package Questions;

import java.util.Scanner;

public class Ex_OddSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(sum(a));
    }
    public static int sum(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
