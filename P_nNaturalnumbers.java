import java.util.Scanner;

public class P_nNaturalnumbers {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        sum(num);

    }
    static void sum (int n){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (n != 0){
            sum = sum + n;
            n = in.nextInt();
        }
        System.out.println(sum);
    }
}
