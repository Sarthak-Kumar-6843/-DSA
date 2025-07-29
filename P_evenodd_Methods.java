import java.util.Scanner;

public class P_evenodd_Methods {
    public static void main(String[] args) {
        evenOdd();

    }

    static void evenOdd(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2 == 0){
            System.out.println("even : " + n);
        }else {
            System.out.println("odd : " + n);
        }
    }


}

