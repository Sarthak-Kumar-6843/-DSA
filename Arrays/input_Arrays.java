package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input_Arrays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //arrays of primitives
    int[] arr = new int[5];
    arr[0] = 23;
    arr[1] = 233;
    arr[2] = 3;
    arr[3] = 63;
    arr[4] = 73;

    System.out.println(arr[4]);

    //input using Loops.loops
    // for(int i = 0 ; i < arr.length ;i++){
    //   arr[i]= in.nextInt();
    // }

    //  for(int i = 0 ; i < arr.length ;i++){
    //   System.out.print(arr[i] + " ");}

      // for(int num : arr){//for every element of array print the element
      //   System.out.print(num + " ");//here num represents element of the array
      // }

      // System.out.println(Arrays.toString(arr));

      //arrays of objects
      String[] str = new String[4];
      for(int i = 0 ; i < str.length ; i ++){
        str[i] = in.next();
      }
      System.out.println(Arrays.toString(str));
      
  }
}
