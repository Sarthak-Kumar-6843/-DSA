package Questions;

import java.util.Scanner;

public class P_pythagoreanTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        pytho(a,b,c);
    }
    static void pytho(int x, int y, int z){
        int a = x*x;
        int b = y*y;
        int c = z*z;
        if (a == b + c || b == a + c || c == a + b) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
