package Strings;

import java.util.Scanner;

public class SumOfStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] array = new String[size];



        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.next();
            count += array[i].length();
        }

        System.out.println(count);
    }
}
