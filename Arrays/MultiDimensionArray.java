package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
  /**
   * @param args
   */
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    // 

    // int[][] arr = {
    //     {1,2,3},//0 index
    //     {4,5},//1st index
    //     {6,7,8,9,0}//2nd indes -> arr2d[2] -> {6,7,8,9,0}     arr2d[2][0] -> 6
    // };
   //input
   int[][] arr = new int[3][4];
   System.out.println(arr.length);//no. of rows


    for( int row = 0 ; row <arr.length ; row ++ ){
      //for each column in every row
      for(int col = 0 ; col < arr[row].length ; col ++){
        arr[row][col] = in.nextInt();
      }
    }


    //output
    //  for( int row = 0 ; row <arr.length ; row ++ ){
    //   System.out.println(Arrays.toString(arr[row]));
    //  }

     for(int[] a : arr){
      System.out.println(Arrays.toString(a));
     }
    }
  }
  
