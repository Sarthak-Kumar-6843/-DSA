import java.util.Scanner;

public class P_area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        System.out.println("area is " +area(radius));
        System.out.println("circumfrence is " +circumfrence(radius));

    }
    static double area(int n){
        return 3.14*n*n;
    }
    static double circumfrence(int n){
        return 2*3.14*n;
    }
}
