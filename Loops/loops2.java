package Loops;

import java.util.Scanner;

public class loops2 {
  public static void main(String[] args) {
    //print no. from 1 to 5
    // for(int num = 1; num <= 5 ; num++){
    //   System.out.println(num);
    // }

    //print no. from 1 to n
    Scanner input = new Scanner(System.in);
    // System.out.print("Enter the no. : ");
    // int n = input.nextInt();
    // for(int num = 1 ; num <= n ; num++ ){
    //   System.out.print(num + " ");}// use this + " " to add space so they don't come in new line and remove ln from print
    

    //while Loops.loops
    /*
     * while(condition){
     * body
     * }
     */
      // int num = 1;
      // while(num <= 5){
      //   System.out.println(num);
      //   num++;
      // }

      //do while
      /*
       * do{
       * 
       *    }while(condition);
       */
        int n =1;
       do{
        System.out.println(n);
        n++;
       }while(n<=5);
  }
  
}
