import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = in.nextInt();
    // boolean ans = isPrime(n);
    // System.out.println(ans);
    System.out.println(isArmstrong(n));
  }

  static boolean isArmstrong(int n){
    int original = n;
    int sum = 0;
    
    while(n > 0){
      int rem = n%10;
      n = n / 10;
      sum = sum + rem*rem*rem;
       
    }
    return sum == original;
  }

  static boolean isPrime(int n){
    if(n <= 1){
      return false;
    }
    int c = 2;
    while (c*c <= n) {
      if (n%c == 0) {
        return false;
      }
      c++;
    }
    return c*c > n;
  }
}
