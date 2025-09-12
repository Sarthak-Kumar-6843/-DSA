package Array;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputs = in.next() ;

        String result = "";//empty string
        for (int i = 0; i < inputs.length(); i++) {
            if (inputs.charAt(i) == 'e'){//checks for e
                result += 'i';//replace e with i in result
            }else {
                result += inputs.charAt(i);//concatenation for both strings
            }
        }

        System.out.println(result);


    }
}
