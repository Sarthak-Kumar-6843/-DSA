package Questions;

import java.util.Scanner;

public class P_vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        eligible(age);
    }
    static void eligible(int age){
        if (age >= 18) {
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }
}
