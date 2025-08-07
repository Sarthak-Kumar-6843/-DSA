import java.util.Scanner;

public class Ex_names {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine(); // <-- consume leftover newline

        String[] name = new String[size];

        for (int i = 0; i < name.length; i++) {
            name[i] = in.nextLine();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
