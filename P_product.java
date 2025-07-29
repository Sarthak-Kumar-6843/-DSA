import java.util.Scanner;

public class P_product {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(product(num1 , num2));

    }
    static int product(int a ,int b){
        return a*b;
    }
}
