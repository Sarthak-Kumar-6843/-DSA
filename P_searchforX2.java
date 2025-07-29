import java.util.Scanner;

public class P_searchforX2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] num = new int[n];

        int x = in.nextInt();
        for (int i = 0; i < num.length; i++) {
           num[i] = in.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x){
                System.out.println("X is at " + i);
            }
        }
    }
}
