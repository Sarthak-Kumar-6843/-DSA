package Questions;

import java.util.Scanner;

public class Ex_searchTwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = in.nextInt();

        int row = in.nextInt();
        int col = in.nextInt();

        int[][] num = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num[i][j] == target){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
