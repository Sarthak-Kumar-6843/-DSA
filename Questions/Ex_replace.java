package Questions;

import java.util.Scanner;

public class Ex_replace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder inputs = new StringBuilder(in.next());
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < inputs.length(); i++) {
            if (inputs.charAt(i) == 'e'){
                result.append('i');
            }else {
                result.append(inputs.charAt(i));
            }
        }
        System.out.println(result);
    }
}
