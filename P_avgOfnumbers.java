import java.util.Scanner;

public class P_avgOfnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        int count = 0;
        double avg;

        while (n != 0){
            sum = sum + n;
            count++;
            n = in.nextInt();
        }
        if(count > 0){
            avg = sum/count;
            System.out.println(avg);
        }else {
            System.out.println("do again");
        }
    }
}