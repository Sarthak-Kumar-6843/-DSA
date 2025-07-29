import java.util.Arrays;
import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int[][] num = new int[row][col];

        //input
        //rows
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = in.nextInt();
            }
        }

        int x = in.nextInt();


        for (int i = 0; i < row; i++) {
            for (int  j = 0;  j < col;  j++) {
                if (num[i][j] == x) {
                    System.out.println("X is at : (" +  i  +"," + j + ")");
                }
            }
        }

        //output
//        for (int i = 0 ; i < row ; i++){
//            for (int j = 0; j < col; j++) {
//                System.out.print((num[i][j] + " "));
//            }
//            System.out.println();
//        }

    }

}
