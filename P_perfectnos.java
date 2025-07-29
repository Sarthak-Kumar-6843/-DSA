import java.util.Scanner;

public class P_perfectnos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num%i == 0) {
                sum = sum + i;

            }

        }
        if (sum == num) {
            System.out.println("perfect");

        }else {
            System.out.println("not perfect");
        }


    }
}
