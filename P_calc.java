import java.util.Scanner;

public class P_calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int ans = 0;
            boolean valid = true;//to track if we should print ans

            System.out.print("Enter operator : ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' ) {
                System.out.print("Enter 2 number : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '*'){
                    ans = num1*num2;
                } else if (op == '+') {
                    ans = num1+num2;
                }else if (op == '-'){
                    ans = num1 - num2;
                } else if (op == '/') {
                    if (num2 != 0){
                        ans = num1/num2;
                    }

                }
            }else {
                System.out.println("invalid");
            }
        System.out.println(ans);
    }
}
