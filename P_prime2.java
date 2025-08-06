import java.util.Scanner;

public class P_prime2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        prime(a);
    }
    public static void prime(int num){
        for (int i = 2; i < num ; i++) {
            if (num%i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
