package Questions;

import java.util.Scanner;

public class Ex_email {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder email = new StringBuilder(in.next());
        StringBuilder user = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                break;
            }
            user.append(email.charAt(i));
        }
        System.out.println(user);
    }
}
