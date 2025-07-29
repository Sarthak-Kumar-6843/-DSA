import java.util.Arrays;

public class searchIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {23,1,45},
                {54,62},
                {55,76,89,93},
                {18,25,65,34,14}
        };
        int target = 25;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target ){
        for (int row = 0; row < arr.length  ;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                 return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
