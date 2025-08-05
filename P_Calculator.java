import java.util.Scanner;

public class P_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        String operator = in.next();

        switch (operator){
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                if (num2 != 0){
                    System.out.println(num1/num2);
                }else{
                    System.out.println("invalid");
                }
                break;

            default:
                System.out.println("Enter correct inputs again");
        }
    }
}
