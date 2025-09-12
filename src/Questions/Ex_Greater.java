package Questions;

import java.util.Scanner;

public class Ex_Greater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(find(a,b));
    }
    public static int find(int num1, int num2){
        int max = num1;

        if (max < num2){
            max = num2;
        }

        return max;
    }
}
