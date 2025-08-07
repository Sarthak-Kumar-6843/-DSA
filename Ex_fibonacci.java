import java.util.Scanner;

public class Ex_fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        fib(n,a,b);
    }
    public static void fib(int n,int a,int b ){
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a ;
            a = temp ;
            count++;
        }
        System.out.println(b);
    }
}
