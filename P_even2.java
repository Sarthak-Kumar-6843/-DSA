import java.util.Scanner;

public class P_even2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        checks(a);
    }
    public static void checks(int num){

        if (num%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


    }
}
