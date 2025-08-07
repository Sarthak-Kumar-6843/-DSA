import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order of matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;


        //to print spiral order matrix

        while (rowStart <= rowEnd && colStart <= colEnd){
            //1
            for (int col = colStart; col < colEnd; col++) {
                System.out.println(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for (int row = rowStart;row < rowEnd; row++){
                System.out.println(matrix[row][colStart] + " ");
            }
            colEnd--;

            //3
            for (int col = colEnd; col >= colStart ; col++) {
                System.out.println(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart ; row++) {
                System.out.println(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}
