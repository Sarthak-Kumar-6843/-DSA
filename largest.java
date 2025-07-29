import java.util.Scanner;

public class largest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //find largest of 3 numbers
    /* 
     * assume a number to be max and then check with other numbers
     */
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();

    int max = num1;
    if(num2 > max){
      max = num2;
    }
    if(num3 > max){
      max = num3;
    }
    System.out.println(max);
  }
  
}
