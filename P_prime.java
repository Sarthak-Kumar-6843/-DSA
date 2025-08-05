import java.util.Scanner;

public class P_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 2; i < num; i++) {
            if (num%i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("Prime");


    }
}
