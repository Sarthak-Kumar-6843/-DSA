import java.util.Scanner;

public class P_primeMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        prime(num);
    }
    static void prime(int n){
        while(n > 0){
            for (int i = 2; i < n ; i++) {
                if (n%i != 0){
                    System.out.println("prime");
                }
                if (n%i == 0) {
                    System.out.println("not prime");

                }
            }

        }

    }
}
