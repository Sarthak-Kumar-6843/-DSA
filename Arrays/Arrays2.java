package Arrays;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] marks = new int[size];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = in.nextInt();
        }

        int target = in.nextInt();

        for (int i = 0; i < marks.length ; i++) {
            if(marks[i] == target) {
                System.out.println("index is : "+ i);

            }
        }


    }
}
