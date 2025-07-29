import java.util.Scanner;

//public class P_palindrome {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String word = in.next();
//        String original = word;//to save the original word and for comparing
//        String reverse = "";//to create an empty string variable
//
//        for (int i = 0; i < word.length() ; i++) {
//
//            reverse = reverse + word.charAt(i);
//        }
//
//        if (reverse.equals(original)) {
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
//    }
//}

import java.util.Scanner;

public class P_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String original = word;
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);  // Append characters in reverse order
        }

        if (reverse.equals(original)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        in.close();
    }
}
