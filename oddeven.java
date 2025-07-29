import java.util.Scanner;

public class oddeven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the no. : ");
    int number = input.nextInt();
    if(number%2 == 0){
      System.out.println("even");
      }
      if (number%2 != 0) {
        System.out.println("odd");
      }
     
    }
  }
  

