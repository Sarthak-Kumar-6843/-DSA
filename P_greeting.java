import java.util.Objects;
import java.util.Scanner;

public class P_greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = in.next();

        if (Objects.equals(name, "Sarthak")) {
            System.out.println("heloo");
        }else {
            System.out.println("goodbye");
        }
    }
}
