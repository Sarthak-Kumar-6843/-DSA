import java.util.Scanner;

public class P_armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();;
        int temp = n;
        int rem;
        int sum = 0;

       while (n>0){
           rem = n%10;
           n = n/10;
           sum = sum + rem*rem*rem;
       }

       if(sum == temp){
           System.out.println("armstrong");
       }else{
           System.out.println("nope");
       }
    }
}
