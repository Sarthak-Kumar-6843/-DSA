import java.util.Scanner;

public class P_vowelOrconstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        ch = Character.toLowerCase(ch);//convert to lowercase if input is A etc

        if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");

        }else {
            System.out.println("constant");
        }
    }
}
