package Recursion;

import java.util.Scanner;

public class functions_method {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // int ans = sum2();
    // System.out.println(ans);
    int ans = sum3(20, 30);
    System.out.println(ans);
  }
  //GIVE VALUES of numbers when u are calling the string
  static int sum3(int a , int b){
    int sum = a + b;
    return sum;

  }

  //return value
  static int sum2 () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 :");
     int num1 = in.nextInt();
    System.out.print("Enter num2 :");
     int num2 = in.nextInt();
     int sum = num1 + num2 ;
     return sum;
  }



  static void sum() {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 :");
     int num1 = in.nextInt();
    System.out.print("Enter num2 :");
     int num2 = in.nextInt();
     int sum = num1 + num2 ;
    System.out.println("the sum is : " + sum);
  }
  /*
   * reutrn type name () {
   * //body
   * return statement;
   * }
   */
}
