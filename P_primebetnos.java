import java.util.Scanner;

public class P_primebetnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        prime(num1, num2);
    }

    static void prime(int a, int b) {
        for (int n = a; n <= b; n++) {
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
