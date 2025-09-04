package Questions;

import java.util.Scanner;

public class P_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int max = a;

        if (max > b) {
            System.out.println(max);

        }else {
            System.out.println(b);
        }


    }

}
