import java.util.Scanner;

public class P_multiply {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int product = multiply(a,b);
        System.out.println(product);
    }
    public static int multiply(int num1 , int num2 ){
       int product = num1*num2;

        return product;
    }
}
