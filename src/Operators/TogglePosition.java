package Operators;

import java.util.Scanner;

public class TogglePosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos = in.nextInt();

        int bitMask = 1<<pos;

        int num = n ^ bitMask;
        System.out.println(num);
    }
}
