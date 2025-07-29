import java.util.Scanner;

public class temperature {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("pls enter the temperature in C : ");
    float temperatureC = input.nextFloat();
    float temperatureF = (temperatureC * 9/5) + 32;
    System.out.println(temperatureF);


  }
  
}
