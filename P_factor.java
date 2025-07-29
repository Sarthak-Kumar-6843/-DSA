import java.util.Scanner;

public class P_factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 1;
        for (int i = 1; i <=n ; i++) {
            ans = ans*i;
        }

        System.out.println(ans);
    }
}
