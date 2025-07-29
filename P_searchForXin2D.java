import java.util.Scanner;

public class P_searchForXin2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num of rows : ");
        int row = in.nextInt();

        System.out.print("enter num of col : ");
        int col = in.nextInt();

        int[][] nums = new int[row][col];

        System.out.print("enter X : ");
        int x = in.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0 ; j < col ; j++){
                nums[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (nums[i][j] == x) {
                    System.out.println("X is at index :  (" + i + " " + j + ") ");
                }
            }
        }
    }
}
