import java.util.Scanner;

public class P_table2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        mul(a);
    }
    public static void mul(int num){
        int table = 1;
        for (int i = 1; i <= 10; i++) {
            table = num*i;
            System.out.println(table);
        }
    }
}
