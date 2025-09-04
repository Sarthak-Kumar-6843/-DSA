package Arrays;

import java.util.Scanner;

public class TwoDarrays_apnaclg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();

        int[][] num = new int[row][col];
        //rows
        for (int i = 0; i < row; i++) {
            //col
            for (int j = 0; j < col; j++) {
                num[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}
