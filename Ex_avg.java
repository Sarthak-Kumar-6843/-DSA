import java.util.Scanner;

public class Ex_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println(avg(a,b,c));
    }
    public static int avg(int num1 ,int num2, int num3){

        return (num1 + num2 + num3)/3;
    }
}
