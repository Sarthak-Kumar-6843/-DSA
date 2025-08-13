import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n > 0 && (n & (n-1)) == 0){
            System.out.println("yuh uh");
        }else {
            System.out.println("nuh uh");
        }
    }
}
