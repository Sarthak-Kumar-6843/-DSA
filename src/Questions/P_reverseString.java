package Questions;

import java.util.Scanner;

public class P_reverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
    }
}
