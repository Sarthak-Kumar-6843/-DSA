import java.util.Scanner;

public class P_palindromeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nos = in.nextInt();

        palindrome(nos);

    }
    static void palindrome(int n){
        int temp = n;
        int reverse = 0;
        while (n > 0){
            int rem = n%10;
            n = n/10;
            reverse = reverse*10 + rem;
        }if (reverse == temp){
            System.out.println("palindrome");
        }else {
            System.out.println("not");
        }
    }
}
